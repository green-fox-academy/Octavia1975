public class SubInt {
    public static void main(String[] args) {
        
    }
public static int[] asztal(int number, int[] numberArray) {
        int counter = 0;
        for (int j : numberArray) {
        if (number == j) {
        counter++;
        }
        }
        int[] numberPlace = new int[counter];
        for (int i = 0; i < numberArray.length; i++) {
        if (number == numberArray[i]) {
        numberPlace[counter - 1] = i;
        }
        }
        return numberPlace;
        }
        }
