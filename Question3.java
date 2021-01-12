import java.io.*;
import java.util.Arrays;
public class Question3{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s [] = br.readLine().split(" ");
        System.out.println("Enter value for K");
        int K = Integer.parseInt(br.readLine());
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr);
        if(K<arr.length){
            System.out.println("Kth smallest value : "+arr[K-1]);
            System.out.println("Kth largest value  : "+arr[arr.length -K ]);
        }else{
            System.out.println("Invalid value for K");
        }
    }
}