public interface SecurityConfigManager {
    void updateSecurityConfig(String configName, String configValue);
    String getSecurityConfig(String configName);
}
