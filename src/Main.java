import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        //task4();
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


    }

}