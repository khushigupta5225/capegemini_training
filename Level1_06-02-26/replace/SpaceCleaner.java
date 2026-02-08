package replace;

public class SpaceCleaner {
    public static void main(String[] args) {

        String text = "This   is    an   example   with   spaces";

        String result = text.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
