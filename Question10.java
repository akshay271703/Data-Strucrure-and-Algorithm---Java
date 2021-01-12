import java.io.*;
public class Question10{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
    }
}