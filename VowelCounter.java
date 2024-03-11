import java.util.Scanner;

 

public class VowelCounter {


    public static void main(String[] args) {


        Scanner Scanner = new Scanner(System.in);


        System.out.print("Veuillez entrer un mot : ");


        String word = Scanner.nextLine();


        int vowelCount = countVowels(word);


        System.out.println("Le mot \"" + word + "\" comprend " + vowelCount + " voyelles.");


    }

 

    public static int countVowels(String word) {


        int count = 0;


        String vowels = "aeiouAEIOU";


        for (int i = 0; i < word.length(); i++) {


            if (vowels.indexOf(word.charAt(i)) != -1) {


                count++;


            }


        }


        return count;


    }


     }