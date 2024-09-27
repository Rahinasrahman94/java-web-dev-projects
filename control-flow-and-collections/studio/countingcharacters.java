import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countingcharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String myString = input.nextLine();

//        String myString = "If the product of two terms is zero then common" +
//                " sense says at least one of the two terms has to be zero to " +
//                "start with. So if you move all the terms over to one side," +
//                " you can put the quadratics into a form that can be factored " +
//                "allowing that side of the equation to equal zero. Once you’ve" +
//                " done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toLowerCase().toCharArray();
        HashMap<Character, Integer> charcount = new HashMap<>();
        for (int i = 0; i < myString.length(); i++) {
            int asciiValue = (int) charactersInString[i];
            if (asciiValue >= 97 && asciiValue <= 122 ) {
                int count = 0;
                for (int j = 0; j < myString.length(); j++) {
                    if (charactersInString[i] == charactersInString[j]) {
                        count++;
                    }
                }

                charcount.put(charactersInString[i], count);
            }
        }

        for (Map.Entry<Character, Integer> student : charcount.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}
