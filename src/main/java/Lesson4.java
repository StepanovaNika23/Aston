import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        // printThreeWords();
        // checkSumSign();
        // printColor();
        // compareNumbers();
        // System.out.println(compareSum(3,5));
        // checkNumb(1);
        // System.out.println(checkValue(8));
        // printStringNumbs("Lesson4", 6);
        // System.out.println(isLeapYear(2024));
        // invertArr();
        // fillArray();
        // updateArray();
        // fillDiagonal(4);
        System.out.println(Arrays.toString(createArr(7, 4)));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign() {
        int a, b;
        a = -9;
        b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 40, b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    public static boolean compareSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void checkNumb(int с) {
        if (с >= 0) {
            System.out.println("Положительное число");
        } else
            System.out.println("Отрицательное число");
    }

    public static boolean checkValue(int d) {
        return d < 0;
    }

    public static void printStringNumbs(String s, int n) {
        System.out.println(s.repeat(n));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0 && year % 400 == 0) {
            return false;
        } else
            return true;
    }

    public static void invertArr() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void updateArray() {
        int nums[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void fillDiagonal(int size) {
        int matrix[][] = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[] createArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
