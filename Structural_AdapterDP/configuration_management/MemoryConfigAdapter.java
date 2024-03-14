public class MemoryConfigAdapter implements SecurityConfigManager {
    private MemorySecurityConfig memorySecurityConfig;

    public MemoryConfigAdapter(MemorySecurityConfig memorySecurityConfig) {
        this.memorySecurityConfig = memorySecurityConfig;
    }

    @Override
    public void updateSecurityConfig(String configName, String configValue) {
        memorySecurityConfig.updateConfig(configName, configValue);
    }

    @Override
    public String getSecurityConfig(String configName) {
        return memorySecurityConfig.getConfig(configName);
    }
}