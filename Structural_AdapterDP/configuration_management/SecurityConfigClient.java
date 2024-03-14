public class SecurityConfigClient {
    private SecurityConfigManager configManager;

    public SecurityConfigClient(SecurityConfigManager configManager) {
        this.configManager = configManager;
    }

    public void updateConfig(String configName, String configValue) {
        configManager.updateSecurityConfig(configName, configValue);
        System.out.println("Security configuration updated successfully.");
    }

    public String getConfig(String configName) {
        String configValue = configManager.getSecurityConfig(configName);
        System.out.println("Security configuration value: " + configValue);
        return configValue;
    }

    public static void main(String[] args) {
        // Instantiate objects and use them
        DatabaseSecurityConfig databaseSecurityConfig = new DatabaseSecurityConfig();
        DatabaseConfigAdapter adapter = new DatabaseConfigAdapter(databaseSecurityConfig);
        SecurityConfigClient client = new SecurityConfigClient(adapter);
        
        // Example: update configuration and retrieve it
        client.updateConfig("exampleConfig", "exampleValue");
        client.getConfig("exampleConfig");
    }
}
