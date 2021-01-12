import java.io.*;
import java.util.LinkedHashSet;
public class Question6{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array 1 elements seperated by spaces");
        String s [] = br.readLine().split(" ");

        int arr1[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr1[i] = Integer.parseInt(s[i]);
        }

        System.out.println("Enter array 2 elements seperated by spaces");
        s = br.readLine().split(" ");

        int arr2[] = new int[s.length];
        for(int i=0;i<=s.length-1;i++){
            arr2[i] = Integer.parseInt(s[i]);
        }

        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
        
    }
    public static void findUnion(int arr1[], int arr2[]){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        int i=0, j=0;
        while(i < arr1.length && j < arr2.length ){
            if(arr1[i] < arr2[j]){
                hs.add(arr1[i++]);
            }else{
                hs.add(arr2[j++]);
            }
        }
        while(i<arr1.length){
            hs.add(arr1[i++]);
        }
        while(j<arr2.length){
            hs.add(arr2[j++]);
        }
        System.out.println("Union of two arrays is");
        for(int z : hs){
            System.out.print(z+" ");
        }
        System.out.println();
    }
    public static void findIntersection(int arr1[], int arr2[]){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        int i=0, j=0;
        while(i < arr1.length && j < arr2.length ){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                hs.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println("Intersections of two arrays is");
        for(int z : hs){
            System.out.print(z+" ");
        }
    }
}