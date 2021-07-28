package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < someInts.length; i ++) {
            if (someInts[i]%2 == 1) {
                System.out.println(someInts[i]);
            }

        }

    }

}
