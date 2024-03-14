import java.util.ArrayList;
import java.util.List;

// Represents the blockchain
public class Blockchain {
    private List<Block> chain;

    public Blockchain() {
        chain = new ArrayList<>();
        // Genesis block
        chain.add(new Block(0, "0"));
    }

    // Add a new block to the blockchain
    public void addBlock(Block block) {
        block = new Block(chain.size(), chain.get(chain.size() - 1).getHash());
        chain.add(block);
    }

    // Validate the integrity of the blockchain
    public boolean isValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block currentBlock = chain.get(i);
            Block previousBlock = chain.get(i - 1);

            // Check if the current block's hash is valid
            if (!currentBlock.isValid()) {
                return false;
            }

            // Check if the previous block's hash matches the current block's previousHash
            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }
        }
        return true;
    }

    // Provide a method to access the chain
    public List<Block> getChain() {
        return chain;
    }
}
