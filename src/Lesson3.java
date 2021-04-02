public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("1. Create an array and fill it with 2 number.");
        int[] array_task_1 = new int[2];
        array_task_1[0] = 1;
        array_task_1[1] = 2;

        System.out.println("2. Create an array and fill it with numbers from 1:1000.");
        int[] array_task_2 = new int[1000];
        for (int i = 1, j=0; i <=1000 ; i++) {
            array_task_2[j++] = i;
        }
        for (int i = 0; i <= array_task_2.length-1 ; i++) {
            System.out.println(array_task_2[i]);

        }
        System.out.println();

        System.out.println("3. Create an array and fill it with odd numbers from -20:20.");
        int[] array_task_3 = new int[21];
        for (int i = -20, j=0; i <= 21; i++) {
            if(i%2!=0){
                array_task_3[j++] = i;
            }
        }
        for (int i = 0; i < array_task_3.length - 1 ; i++) {
            System.out.println(array_task_3[i]);
        }

        System.out.println();

        System.out.println("4. Create an array and fill it. Print all elements which can be divided by 5.");
        int[] array_task_4 = new int[20];
        for (int i = 1, j = 0; i <= array_task_4.length; i++) {
            array_task_4[j++] = i;
        }

        for (int i = 0; i <= array_task_4.length - 1 ; i++) {
            if(array_task_4[i]%5==0){
                System.out.println(array_task_4[i]);
            }
        }
        System.out.println();

        System.out.println("5. Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
/*  ***Other solution***
        double[] array_task_5 = new double[4432];
        int i = 0;
        for(double d = 24.12; d <= 467.23; d+=0.1){
            array_task_5[i++] = d;
        }
        for (int j = 0; j < array_task_5.length; j++) {
            System.out.println(array_task_5[j]);
        }
*/
        int[] array_task_5 = new int[500];
        for (int i = 1, j = 0; i <= array_task_5.length ; i++) {
            array_task_5[j++] = i;
        }

        for (int i = 0; i <= array_task_5.length - 1 ; i++) {
            if(24.12 < array_task_5[i] && array_task_5[i] < 467.23)
                System.out.println(array_task_5[i]);
        }
        System.out.println();

        System.out.println("6. Create an array and fill it. Print count of elements which can be divided by 2.");
        int[] array_task_6 = new int[21];
        int count = 0;

        for (int i = 0, j = 1; i <=array_task_6.length - 1 ; i++) {
            array_task_6[i] = j++;
        }

        for(int i = 0; i < array_task_6.length; i++){
            if(array_task_6[i]%2==0){
                count +=1;
            }
        }
        System.out.println(count);
        System.out.println();


        System.out.println("7. Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.\n");

        int N = 2;
        int[] array_task_7 = new int[11];
        for (int i = 1; i < array_task_7.length; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d\n",N, i, result);
        }
    }
}
