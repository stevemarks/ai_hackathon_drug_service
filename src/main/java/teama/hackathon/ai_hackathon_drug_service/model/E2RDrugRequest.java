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

    public E2RDrugRequest(int age, String drugName) {
        prompt = String.format("I am %d years old. Don't use any terms. " +
            "Can you summarise the Wikipedia article for %s with the vocabulary I can understand " +
            "and in a maximum of 100 words.", age, drugName);
    }
}
