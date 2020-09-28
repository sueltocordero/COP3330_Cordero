public class Main {

    public static void main(String[] args){
    Encrypter myEncrypter = new Encrypter();
    Decrypter myDecrypter = new Decrypter();
    String encryptedValue = myEncrypter.encrypt("3214");
    String encryptedValue1 = myEncrypter.encrypt("0912");
    String decryptedValue = myDecrypter.decrypt("8109");
    String decryptedValue1 = myDecrypter.decrypt("8976");
    System.out.println(encryptedValue);
    System.out.println(encryptedValue1);
    System.out.println(decryptedValue);
    System.out.println(decryptedValue1);

    }
}
