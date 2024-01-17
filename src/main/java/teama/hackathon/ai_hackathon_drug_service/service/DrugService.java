package teama.hackathon.ai_hackathon_drug_service.service;

import org.springframework.stereotype.Service;
import teama.hackathon.ai_hackathon_drug_service.model.E2RDrugRequest;

@Service
public class DrugService {
    public void summaryDrug(int age, String drugName) {
        var E2RDrugRequest = new E2RDrugRequest(age, drugName);
    }
}
