public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
        //task4();
    }
    public static void task1 (){
        int[] weight = new int[12];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i]);
        }
        System.out.println();

        double[] weight2 = {1.57, 7.654, 9.986};
        for (double value : weight2) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();

        int[] weight3 = {1, 4, 9, 16, 25, 36};
        for (int p : weight3) {
            System.out.printf("%d ", p);
        }






    }
}