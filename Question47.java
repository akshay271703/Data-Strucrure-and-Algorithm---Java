import java.io.*;
public class Question47
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String s = br.readLine().trim();
        String result = "";
        for(int i=s.length()-1; i>=0 ;i--){
            result+=s.charAt(i);
        }
        System.out.println("Reversed String is : "+result);
    }
}