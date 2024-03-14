import java.util.Scanner; // Import Scanner for user input
import java.util.HashSet; // Import HashSet for storing unique voter IDs
import java.util.Set; // Import Set for storing unique voter IDs

public class SecureVotingSystem {
    public static void main(String[] args) {
        // Create a blockchain
        Blockchain blockchain = new Blockchain();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of votes
        System.out.print("Enter the number of votes: ");
        int numVotes = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Set to store unique voter IDs
        Set<String> voterIds = new HashSet<>();

        // Collect votes from the user
        for (int i = 0; i < numVotes; i++) {
            System.out.println("\nEnter details for Vote " + (i + 1) + ":");
            System.out.print("Enter the candidate: ");
            String candidate = scanner.nextLine();
            
            String voterId;
            boolean isUnique;
            do {
                System.out.print("Enter the voter ID: ");
                voterId = scanner.nextLine();
                isUnique = voterIds.add(voterId); // Add the voter ID to the set, returns true if unique
                if (!isUnique) {
                    System.out.println("Voter ID already exists. Please enter a unique ID.");
                }
            } while (!isUnique);

            // Create a vote
            Vote vote = new Vote(candidate, voterId);

            // Create a block and add the vote to it
            Block block = new Block(blockchain.getChain().size(), blockchain.getChain().get(blockchain.getChain().size() - 1).getHash());
            block.addVote(vote);

            // Add the block to the blockchain
            blockchain.addBlock(block);
        }

        scanner.close(); // Close the scanner

        // Validate the blockchain
        System.out.println("\nIs Blockchain Valid? " + blockchain.isValid());
    }
}
