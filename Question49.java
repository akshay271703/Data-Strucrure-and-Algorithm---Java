import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class Question49
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the String");
        HashMap<Character,Integer> hm  = new HashMap<>();
        String s = br.readLine().trim();
        String result = "";
        for(int i=0; i<=s.length()-1 ;i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);
            }else{
                hm.put(ch, 0);
            }
        }

        for(char ch : hm.keySet()){
            System.out.println(ch+" "+hm.get(ch));
        }
    }
}