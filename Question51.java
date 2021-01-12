import java.io.*;
public class Question51
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter two spac seperated Strings");
        String s[] = br.readLine().trim().split(" ");
        if( (s[0]+s[0]).contains(s[1])){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}