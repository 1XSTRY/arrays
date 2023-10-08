import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
    }

    public static void task1_2() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.print(Arrays.toString(weight));

        System.out.println();

        double[] weight2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(weight2));

        int[] weight3 = {1, 4, 9, 16, 25, 36};
        System.out.println(Arrays.toString(weight3));

    }

    public static void task3() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }


        }
        System.out.println();

        double[] weight2 = {1.57, 7.654, 9.986};
        for (int i = weight2.length - 1; i >= 0; i--) {
            System.out.print(weight2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] weight3 = {1, 4, 9, 16, 25, 36};
        for (int i = weight3.length - 1; i >= 0; i--) {
            System.out.print(weight3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Исходный массив: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }

        System.out.print("Преобразованный массив: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}


