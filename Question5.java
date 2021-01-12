import java.io.*;
public class Question5{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        int low = 0, mid = 0 , high = arr.length-1;

        while(mid<=high){
            int current = arr[mid];
            // Low Value
            if(current < 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            // Mid Value
            else if(current == 0){
                mid++;
            }
            //High Value
            else if (current >0){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}