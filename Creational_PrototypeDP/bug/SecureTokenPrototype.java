import java.security.SecureRandom;
import java.util.Base64;

interface SecureTokenPrototype extends Cloneable {
    SecureTokenPrototype cloneShallow() throws CloneNotSupportedException;
    SecureTokenPrototype cloneDeep() throws CloneNotSupportedException;
    String getToken();
}