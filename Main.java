import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //a();  q1
       // rev(); q4

        /* q2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int in = input.nextInt();
        int arr = 0;



        int[] array = {1, 1, 1, 3, 3, 5};
        for (int i = 0; i < array.length; i++) {
            if (in == array[i]) {
                ++arr;
            }
            System.out.println("result" + arr);

         */ //q3
        /*
        int [] array = {1, 4, 17, 7, 25, 3, 100};
        int max = array[0];

        for (int i=0; i<7;i++){
            if (array[i]>max);
            max = array[i];
        } System.out.println("The Largest :  " + max);
    }

         */

    /* q1
    public static void a() {
        String[] anm = {"cat", "dog", "red", "is", "am"};

        String max = anm[0];
        for (int i = 0; i < anm.length; i++) {
            if (anm[i].length() >= max.length()) {
                max = anm[i];
            }
            System.out.println(max);
        }

     */
    } public static void rev (){
        int [] numbers = {5,4,3,2,1};
        for (int i=numbers.length-1; i>0;i--){
            System.out.print(numbers[i]);
        }
    }
}
