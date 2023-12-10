import java.util.ArrayList;

public class Arrays{
    /** public static int[] buildArray(int[] ip) { //creating an array as per asked in question
        int[] ans = new int[ip.length];
        for (int i = 0; i < ip.length; i++) {
            ans[i] = ip[ip[i]];
        }
        return ans;
    }
    public static void main(String[] args) { //getting input and passing it to buildArray method for output
        int[] ip = {0, 2, 1, 5, 3, 4};
        int[] ans = buildArray(ip);
        for (int i : ans) {   //enhanced for loop can say (foreach loop)
            System.out.print(i + " ");//rather than writing two separate for loops one does the work
        }
    } */
//    public static int[] takeip(int[] no){
//        int a[] = new int[no.length];
//        int number_len = no.length;
//        int a_len = a.length;
//        int []result = new int[a_len+number_len];
//        //int []res = new int[no.length + a.length]; //both will work fine
//        for (int i = 0; i < no.length ; i++) {
//            a[i] = no[i];
//        }
//        System.arraycopy(no,0,result,0,number_len);
//        System.arraycopy(a,0,result,number_len, a_len);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int [] no = {12, 45, 39};
//        int [] ans =  takeip(no);
//        for (int i:ans) {
//            System.out.print(i+" ");
//        }
//    }
//    public static int[]shuffle(int[] ip, int n){
//        int[] arr = new int[ip.length]; //array created of length ip, ip is the input which we can decide.
//        int x =0;
//        int y =n;
//        for (int i = 0; i <n*2; i+=2) { //specifies the length of the array and runs till the 2n is reached.
//            arr[i] = ip[x++];
//        }
//        for (int i = 1; i < n*2; i+=2) {
//            arr[i] = ip[y++];
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] no ={23, 34, 67, 56, 81, 90};
//        int n = 3;
//        int[] ans = shuffle(no, n);
//        for (int i:ans) {
//        System.out.print(i+" ");
//        }
//    }
//    public static int[] smaller(int[] input){
//        int temp=0;
//        int current = input.length;
//        int[] result= new int[current];
//        for (int i = 0; i <current; i++) {
//            for (int j = 0; j <current ; j++) {
//                if(i !=j){
//                    if(input[i]> input[j]){
//                        temp++;
//                    }
//                }
//            }
//            result[i] = temp;
//            temp = 0;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] ip ={12, 34, 11, 10, 56};
//        int[] ans = smaller(ip);
//        for (int i: ans) {
//            System.out.print(i+" ");
//        }
//    }
    public static int[] target(int[] ip, int[] index){
        ArrayList<Integer>arr = new ArrayList<Integer>();
        int[] ans = new int[ip.length];
        for(int i=0; i<ip.length; i++){
            arr.add(index[i] , ip[i]);
        }
        for(int i =0; i< arr.size(); i++){
            ans[i]= arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nos = {0, 1, 2, 3, 4};
        int[] indexs= {0, 1, 2, 2, 1};
         int[] ans = target(nos, indexs);
        for (int i:ans) {
            System.out.print(i+" ");
        }
    }
}
