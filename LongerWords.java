/*
 * Nicholas Weber
 *user input sentence 
 *computs the average word length
 *prints out long the words that are longer than the average one per line 
 */
package review;

import java.util.ArrayList;
import java.util.Scanner;

public class LongerWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence? ");
        String sent = scanner.nextLine();
        ArrayList<String> a = new ArrayList<>();
        int av = AverageWord(a,sent);
        PrintWord(a,av);
    }
    
    
    //takes the sentence from the scanner and splits it and adds it too an arraylist
    //computs the average
    public static int AverageWord(ArrayList<String> a, String sent) {
        int counter = 0;
        for ( String word : sent.split("\\s+") ) {
            a.add(word);
            counter += word.length();
        }
        int size = a.size();
        int average = counter / size;
        return average;
    }
    //prints the arraylist of words 
    //only the words that have are longer than the average
    public static void PrintWord(ArrayList<String> a, int av) {
        for ( String word : a ) {
            if( word.length() > av ){
               System.out.println(word); 
            }  
        }
    }
}
