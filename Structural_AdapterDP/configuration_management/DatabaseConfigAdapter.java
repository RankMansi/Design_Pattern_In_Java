public class DatabaseConfigAdapter implements SecurityConfigManager {
    private DatabaseSecurityConfig databaseSecurityConfig;

    public DatabaseConfigAdapter(DatabaseSecurityConfig databaseSecurityConfig) {
        this.databaseSecurityConfig = databaseSecurityConfig;
    }

    @Override
    public void updateSecurityConfig(String configName, String configValue) {
        databaseSecurityConfig.updateConfig(configName, configValue);
    }

    @Override
    public String getSecurityConfig(String configName) {
        return databaseSecurityConfig.getConfig(configName);
    }
}