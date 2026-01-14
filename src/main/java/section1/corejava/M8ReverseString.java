package section1.corejava;

public class M8ReverseString {
    public static void main(String[] args) {

        String s = "Hello";
        for (int i=0; i<s.length(); i++){
            s=s.charAt(i) + s.substring(0, i) + s.substring(1 + i);
        }
        System.out.println("Reverse String output : " + s);
    }
}
