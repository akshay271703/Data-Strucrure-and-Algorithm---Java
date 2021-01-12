import java.io.*;
public class Question53 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter N");
        int N = Integer.parseInt(br.readLine().trim());
        if(N<=1){
            System.out.println("1");
        }else{
            String num = N+" ";
            int count=1;
            char current = num.charAt(0);
            for(int i=1;i<=num.length()-1;i++){
                if(num.charAt(i)==current){
                    count++;
                }else{
                    System.out.print(count+""+Integer.parseInt(String.valueOf(current)));
                    count=1;
                    current = num.charAt(i);
                }
            }
        }
    }
}
