import java.util.*;
public class Conditions{
    public static void main(String[] args) {
       /** Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = in.nextInt();
        int sum =+ no;
        /** System.out.println("Enter a number: ");
        int h = in.nextInt();
        //int area = side*side;
        //System.out.println("Output is "+(Math.pow(side, 2)));
        System.out.println("Output for perimenter is "+(Math.PI*2*side*h));
    */
      /* int a = 0 , b=1;
        for (int i = 0; i < 5; i++) {
            int c = a+b;
            System.out.print(" "+c);
            a=b;
            b =c;
        } */
        /**Scanner in = new Scanner(System.in);
        int sum =0;
        while (true){
            System.out.println("Enter a number: ");
            int no = in.nextInt();
            if(no == 0){
                break;
            }
            sum += no;
        }
        System.out.print("Sum of all nos is "+sum); */
        int n =6;
        int res = factorial(n);
        System.out.println(res);
        }
        public static int factorial(int n){
            if (n == 0) {
                return 1;
            } else {

                return n * factorial(n - 1);
            }
        }
}