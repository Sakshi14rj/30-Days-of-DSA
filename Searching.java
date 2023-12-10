//import java.util.*;


//public class Searching {
//    public static void main(String[] args) {
//        String name = "Sakshi";
//        char target = 'i';
//        System.out.println(linear(name, target));
//    }
//    static int linear(String name, char target){
//        if(name.length()==target){
//            return -1;
//        }
//        for (int i = 0; i <name.length() ; i++) {
//            if (target == name.charAt(i)){
//                return i;
//            }
//        }
//        return -1;
//    }
//public static void main(String[] args) {
//    int[] arr = {23, 56, 12, 11, 45, 90};
//    System.out.println("Minimum Element in this Array is: "+min(arr));
//}
//  static int min(int[]ip){
//    int ans = ip[0];
//    for (int i = 1; i <ip.length ; i++) {
//        if(ip[i]< ans) {
//            ans = ip[i];
//        }
//    }
//    return ans;
//  }
//    static int range(int[] ip, int start, int end, int target){
//        if(ip.length== 0){
//            return -1;
//        }
//        for (int i = start; i <= end ; i++) {
//            int element = ip[i];
//            if (element == target){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int[] arr= {23, 45, 29, 12,78, 50};
//        System.out.println("This is the array: "+ Arrays.toString(arr));
//        System.out.print("Write the target element to know it's index:");
//        int target_element = sc.nextInt();
//        System.out.println("The target element's index is "+range(arr,0,5,target_element));
//    }
}


