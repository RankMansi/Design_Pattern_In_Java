// Shallow Cloning- For session token generator and reusing it for different purposes
// Deep Cloning- Used for unique token generation for every session and users

public class SecureTokenGenerator {
    public static void main(String[] args) {
        SecureTokenPrototype prototype = new SecureToken();

        try {
            SecureTokenPrototype shallowClone = prototype.cloneShallow();
            SecureTokenPrototype deepClone = prototype.cloneDeep();

            System.out.println("Original Token: " + prototype.getToken());
            System.out.println("Shallow Clone Token: " + shallowClone.getToken());
            System.out.println("Deep Clone Token: " + deepClone.getToken());
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}