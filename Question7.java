import java.io.*;
public class Question7{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter the value of K");
        int K = Integer.parseInt(br.readLine());
        int counter = 0;
        int N = arr.length;
        int result [] = new int[arr.length];
        for(int i =(N-K); i<=N-1;i++){
            result[counter++] = arr[i];
        }
        for(int i=0 ; i <(N-K); i++){
            result[counter++] = arr[i];
        }
        System.out.println("Resulted Array is");
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}