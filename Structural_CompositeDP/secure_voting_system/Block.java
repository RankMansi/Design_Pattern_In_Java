import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

// Represents a block in the blockchain
public class Block {
    private int index;
    private String previousHash;
    private List<Vote> votes;
    private long timestamp;
    private String hash;

    public Block(int index, String previousHash) {
        this.index = index;
        this.previousHash = previousHash;
        this.votes = new ArrayList<>();
        this.timestamp = System.currentTimeMillis();
        this.hash = calculateHash();
    }

    private String calculateHash() {
        String dataToHash = index + previousHash + timestamp + votes.toString();
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(dataToHash.getBytes());
            for (byte hashByte : hashBytes) {
                sb.append(String.format("%02x", hashByte));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    // Add a vote to the block
    public void addVote(Vote vote) {
        votes.add(vote);
        hash = calculateHash();
    }

    // Get the current block's hash
    public String getHash() {
        return hash;
    }

    // Get the previous block's hash
    public String getPreviousHash() {
        return previousHash;
    }

    // Validate the block's integrity
    public boolean isValid() {
        return hash.equals(calculateHash());
    }
}
