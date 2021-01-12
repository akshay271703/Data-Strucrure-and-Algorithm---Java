import java.io.*;
public class Question2{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements seperated by spaces");
        String s [] = br.readLine().split(" ");
        try{
            int arr[] = new int[s.length];
            for(int i=0;i<=s.length-1;i++){
                arr[i] = Integer.parseInt(s[i]);
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int number : arr){
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }

            System.out.println("Max number : "+max);
            System.out.println("Min number : "+min);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}