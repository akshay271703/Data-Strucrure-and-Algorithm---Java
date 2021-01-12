import java.io.*;
public class Question8{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        int max_so_far = Integer.MIN_VALUE;
        int currentSum = 0;
        int start=0, end=0 , ss=0;

        for(int i=0;i<=arr.length-1;i++){
            currentSum = currentSum + arr[i];
            if(max_so_far<currentSum){
                max_so_far = currentSum;
                start = ss;
                end = i;
            }
            if(currentSum < 0){
                currentSum = 0;
                ss=i+1;
            }
        }
        System.out.println("Maximum sum is : "+max_so_far);
        System.out.println("For the elements :");
        for(int i=start; i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}