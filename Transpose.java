public class Transpose extends Cipher {
    Transpose (String s) {
        super(s);
    }

    public String encode(String word) {
        StringBuffer result = new StringBuffer();
        result.reverse();
        return result.toString();
    }

    public String decode(String word) {
        StringBuffer result = new StringBuffer();
        return result.toString();
    }
}