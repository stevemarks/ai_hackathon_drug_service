package teama.hackathon.ai_hackathon_drug_service.service;

import java.util.List;
import teama.hackathon.ai_hackathon_drug_service.model.Drugs;

public class DrugService {

    private String url_prefix = "https://en.wikipedia.org/wiki/";
    public List<Drugs> getDrugs(Integer age, String drug) {
        String text = url_prefix + drug;
        return List.of();
    }
}
