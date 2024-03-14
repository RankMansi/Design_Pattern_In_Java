public class MemorySecurityConfig {
    public void updateConfig(String configName, String configValue) {
        // Implement logic to update the security configuration in memory
        System.out.println("Updated security configuration in memory: " + configName + " = " + configValue);
    }

    public String getConfig(String configName) {
        // Implement logic to retrieve the security configuration from memory
        // Example implementation returning dummy value for demonstration
        return "DummyValueFromMemory"; 
    }
}