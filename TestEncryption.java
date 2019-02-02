import javax.swing.JOptionPane;

public class TestEncryption {
    public static void main(String[] args) {
        new TestEncryption();
    }

    public TestEncryption() {
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message");

        output += "The original message is \n" + text + "\n";

        Cipher c = new Caesar(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCaesar Cipher\nThe encrypted message is \n" + code + "\n";
        c.decrypt(code);
    }

    static void display(String s) {
        JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt", JOptionPane.INFORMATION_MESSAGE);
    }
}