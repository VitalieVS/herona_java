import org.junit.Test;

public class Main {
    @Test
    public void Herona() {
        generateTemplate();
    }

    public void generateTemplate() {
        StringBuilder generated = new StringBuilder("a"); //setting initial to a
        int n = 10;

        char a;
        for (int i = 98; i < 127; i++) { //starting from 98 ignoring first case
            a = (char) i;
            generated.insert(0, a + generated.toString()); // un precedent oarecare p/u simplificarea algoritm
            if (generated.length() >= n) { // stopping generating
                System.out.println(generated.charAt(n - 1));
                break; //breaking going further
            }
        }
    }
}
