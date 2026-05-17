package src.ai;
public abstract class AIAssistant {

    private String assistantName;

    public AIAssistant(String assistantName) {
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public abstract void interact();
}