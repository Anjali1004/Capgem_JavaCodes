import java.util.*;
public class change_case {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str =scan.nextLine();
        int len = str.length();
        System.out.println("Upper Case: "+str.toUpperCase());

        System.out.println("Lower Case: "+str.toLowerCase());

        StringBuffer capitalize=new StringBuffer(str);   
        for (int i = 0; i < len; i++) {
            Character ch = ((i-1)>=0) ? str.charAt(i-1) : str.charAt(0);
            if(i==0 || ch.equals(' '))
              capitalize.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        }
        System.out.println("Capitalize: "+capitalize);

        StringBuffer sentence_case=new StringBuffer(str.toLowerCase());
        for (int i = 0; i < len; i++) {
          Character ch = ((i-2)>=0) ? str.charAt(i-2) : str.charAt(0);
          if(i==0 || ch.equals('.'))
            sentence_case.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        }
        System.out.println("Sentence Case: "+sentence_case);

        StringBuffer invert=new StringBuffer(str);   
        for (int i = 0; i < len; i++) {
          if (Character.isLowerCase(str.charAt(i))) 
            invert.setCharAt(i, Character.toUpperCase(str.charAt(i)));
          else
            invert.setCharAt(i, Character.toLowerCase(str.charAt(i)));
        }
        System.out.println("Invert: "+invert);
     }
}
