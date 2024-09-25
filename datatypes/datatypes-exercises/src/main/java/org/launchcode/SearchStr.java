package org.launchcode;
import java.util.Scanner;
public class SearchStr {
    public static void main(String[] args) {
        String wonderland = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’"+" Note";
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the word to search");
        String tosearch = input.next();
        String wonder = wonderland.toUpperCase();
        String search = tosearch.toUpperCase();
//        System.out.println(wonder);
//        System.out.println(search);
        System.out.println(wonder.contains(search));
        System.out.println(search.length());
        int index = wonder.indexOf(search);
        System.out.println("index of substring " + index);
        System.out.println(wonder.replace(search," "));


    }
}
