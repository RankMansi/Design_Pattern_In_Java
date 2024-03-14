public class ElectionFacadeDemo {
    public static void main(String[] args) {
        ElectionFacade facade = new ElectionFacade();

        // Register voters
        facade.registerVoter("Alice", 25);
        facade.registerVoter("Bob", 17); // Too young to vote

        // Register candidates
        facade.registerCandidate("John");

        // Voting
        facade.vote("Alice", "John");
        facade.vote("Bob", "John"); // Bob is not registered
    }
}