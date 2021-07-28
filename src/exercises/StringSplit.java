package exercises;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitWords = str.split(" ");
        String[] splitSentence = str.split("\\.");
        System.out.println(Arrays.toString(splitWords));
        System.out.println(Arrays.toString(splitSentence));
    }
}
