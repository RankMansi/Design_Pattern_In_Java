class Voter {
    private String name; // Change to private

    public Voter(String name) {
        this.name = name;
    }

    public String getName() { // Getter method for name
        return name;
    }

    public void voteForCandidate(String candidate) {
        System.out.println(name + " voted for " + candidate);
    }
}
