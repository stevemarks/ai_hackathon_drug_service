package teama.hackathon.ai_hackathon_drug_service.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import teama.hackathon.ai_hackathon_drug_service.model.Choice;
import teama.hackathon.ai_hackathon_drug_service.model.Drugs;
import org.springframework.stereotype.Service;
import teama.hackathon.ai_hackathon_drug_service.model.E2RDrugRequest;
import teama.hackathon.ai_hackathon_drug_service.model.E2RDrugResponse;

@Service
public class DrugService {

    @Autowired
    private RestTemplate restTemplate;

    private String url_prefix = "https://en.wikipedia.org/wiki/";
    private String ai_endpoint =
        "https://in-bjss-openai-us.openai.azure.com/openai/deployments/davinci/completions?api-version=2023-09-15-preview";

    public List<Drugs> summaryDrug(Integer age, String drugName) {
        String url = url_prefix + drugName;
        var e2RDrugRequest = new E2RDrugRequest(age, url);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<E2RDrugRequest> entity = new HttpEntity<>(e2RDrugRequest, headers);
        ResponseEntity<E2RDrugResponse> response =
            restTemplate.exchange(ai_endpoint, HttpMethod.POST, entity, E2RDrugResponse.class);
        return response.getBody().getChoices()
            .stream().map(d -> new Drugs(drugName, d.getText()))
            .collect(Collectors.toList());
    }
}
