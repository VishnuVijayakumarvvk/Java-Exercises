import java.util.Locale;

public class charchg {


    public static String change(String input) {
        int size = input.length();
        StringBuilder output=new StringBuilder();
        input.toUpperCase(Locale.ROOT);
        for(int i=0;i<size;i++){
            char letter= input.charAt(i);
            if(letter == 'A'){
                output.append('X');
            }else if(letter=='B'){
                output.append('Y');
            }else if(letter == 'C'){
                output.append('Z');
            }else{
                int ascii=(int)letter;
                int act=ascii-3;
                char let=(char)act;
                output.append(let);
            }
        }
        return  output.toString();
    }

    public static void main(String[] args){
        System.out.println(change("BHX"));
    }
}
