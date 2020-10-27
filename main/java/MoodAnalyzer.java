

public class MoodAnalyzer {

    private String message;

    // Default Constructor
    public MoodAnalyzer() {
    }

    // Constructor with Parameter
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    /**
     * Method To Analyze Mood
     * @return Mood
     * Refactored: Removed message parameter
     */
    public String analyzeMood() {
        return message.contains("Sad") ? "SAD" : "HAPPY";
    }
}


