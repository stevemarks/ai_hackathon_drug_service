package teama.hackathon.ai_hackathon_drug_service.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import teama.hackathon.ai_hackathon_drug_service.model.Drugs;

@Slf4j
@RestController
public class DrugController {

    @GetMapping("/v1/vet_drugs")
    public List<Drugs> getDrugs(@RequestParam("age") Integer age, @RequestParam("drug") String drug) {
        log.info("age={} drug={}", age, drug);
        return List.of();
    }
}
