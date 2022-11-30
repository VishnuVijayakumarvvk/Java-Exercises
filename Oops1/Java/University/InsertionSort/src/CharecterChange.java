import java.util.Locale;

public class CharecterChange {

    public static String change(String input) {
        int size=input.length();
        StringBuilder output=new StringBuilder();
        input.toUpperCase(Locale.ROOT);
        for(int i=0;i<size;i++){
            char letter=input.charAt(i);
            if(letter=='A'|| letter=='A'){
                output.append('X');
            }
            else if(letter=='b' || letter=='B'){
                output.append('Y');
            }
            else if(letter=='c'|| letter=='C'){
                output.append('Z');
            }
            else {
                int ascii = (int) letter;
                ascii = ascii - 3;
                char got = (char) ascii;
                output.append(got);
            }
        }
        return output.toString();
    }

    public static void main(String[] args){
        System.out.println(change("bHJ"));
    }
}
