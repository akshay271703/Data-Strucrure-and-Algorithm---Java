import java.io.*;
public class Question52 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter first second and result separated by space");
        String s[] = br.readLine().trim().split(" ");
        if(shuffleCheck(s[0], s[1], s[2])){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
    static boolean shuffleCheck(String first, String second, String result) {
        if(first.length() + second.length() != result.length()) {
          return false;
        }
        int i = 0, j = 0, k = 0;
        while (k != result.length()) {
          if (i < first.length() && first.charAt(i) == result.charAt(k))
            i++;
          else if (j < second.length() && second.charAt(j) == result.charAt(k))
            j++;
          else {
            return false;
          }
          k++;
        }
        if(i < first.length() || j < second.length()) {
          return false;
        }
    
        return true;
      }
}
