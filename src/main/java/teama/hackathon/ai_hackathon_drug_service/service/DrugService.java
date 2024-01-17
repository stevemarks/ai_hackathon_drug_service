package teama.hackathon.ai_hackathon_drug_service.service;

import java.util.List;
import teama.hackathon.ai_hackathon_drug_service.model.Drugs;
import org.springframework.stereotype.Service;
import teama.hackathon.ai_hackathon_drug_service.model.E2RDrugRequest;

@Service
public class DrugService {

    private String url_prefix = "https://en.wikipedia.org/wiki/";

    public void summaryDrug(int age, String drugName) {
        var E2RDrugRequest = new E2RDrugRequest(age, drugName);
    }
}
