package teama.hackathon.ai_hackathon_drug_service.model;

public class E2RDrugRequest {
    private final String prompt;
    private final double temperature = 0.7;
    private final int maxTokens = 800;
    private final double topP = 0.95;
    private final double frequencyPenalty = 0;
    private final double presencePenalty = 0;
    private final int bestOf = 1;
    private final String stop = null;

    public E2RDrugRequest(int age, String url) {
        prompt = String.format("Summary of %s " +
            "with language appropriate for an %d year old in 200 words or less", url, age);
    }
}
