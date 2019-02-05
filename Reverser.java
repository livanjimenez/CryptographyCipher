public class Reverser extends Transpose {
    public Reverser(String s) {
        super(s);
    }

    public String reverseText(String word) {
        StringBuffer result = new StringBuffer(word);

        for (int i = 0; i < result.length(); i++) {
            result.reverse();
        }
        
        return result.toString();
    }

    public String decode(String word) {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}