// Represents a vote in the voting system
public class Vote {
    private String candidate;
    private String voterId;

    public Vote(String candidate, String voterId) {
        this.candidate = candidate;
        this.voterId = voterId;
    }

    public String getCandidate() {
        return candidate;
    }

    public String getVoterId() {
        return voterId;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "candidate='" + candidate + '\'' +
                ", voterId='" + voterId + '\'' +
                '}';
    }
}
