public class FileConfigAdapter implements SecurityConfigManager {
    private FileSecurityConfig fileSecurityConfig;

    public FileConfigAdapter(FileSecurityConfig fileSecurityConfig) {
        this.fileSecurityConfig = fileSecurityConfig;
    }

    @Override
    public void updateSecurityConfig(String configName, String configValue) {
        fileSecurityConfig.updateConfig(configName, configValue);
    }

    @Override
    public String getSecurityConfig(String configName) {
        return fileSecurityConfig.getConfig(configName);
    }
}
