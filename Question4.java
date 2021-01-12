import java.io.*;
public class Question4{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr[i] = Integer.parseInt(s[i]);
        }    
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        
        while(mid<=high){
            switch(arr[mid]){
                case 0 : int temp = arr[low];
                         arr[low] = arr[mid];
                         arr[mid] = temp;
                         low++;
                         mid++;
                         break;
                case 1 : mid++;
                         break;
                case 2 : int tempp = arr[high];
                         arr[high] = arr[mid];
                         arr[mid] = tempp;
                         high--;
                         break;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}