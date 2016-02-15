import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the word");
        String word = scan.nextLine();
        System.out.println(checkPolindrom(word, 0));


    }

    public static String checkPolindrom(String word, int permIndex){
        if(word.length()/2>=permIndex) {
            if (word.charAt(permIndex) == word.charAt(word.length() - (permIndex+1))) {
                ++permIndex;
                return checkPolindrom(word, permIndex);
            } else return "The word is not a polindrom";
        } else return "The word is a polindrom";
    }

}
