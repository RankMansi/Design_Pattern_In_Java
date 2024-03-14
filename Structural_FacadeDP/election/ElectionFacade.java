import java.util.ArrayList;
import java.util.List;

class ElectionFacade {
    private List<Voter> voters;
    private ElectionCommission commission;

    public ElectionFacade() {
        voters = new ArrayList<>();
        commission = new ElectionCommission();
    }

    public void registerVoter(String name, int age) {
        if (commission.validateVoterAge(age)) {
            voters.add(new Voter(name));
            System.out.println(name + " registered as a voter successfully.");
        } else {
            System.out.println(name + " cannot register as a voter due to age restriction.");
        }
    }

    public void vote(String name, String candidate) {
        for (Voter voter : voters) {
            if (voter.getName().equals(name)) { // Use getName() method
                System.out.println(name + " is voting...");
                voter.voteForCandidate(candidate);
                return;
            }
        }
        System.out.println("Voter " + name + " is not registered.");
    }

    public void registerCandidate(String candidate) {
        if (commission.validateCandidateRegistration(candidate)) {
            System.out.println(candidate + " registered as a candidate successfully.");
        } else {
            System.out.println("Candidate registration failed.");
        }
    }
}
