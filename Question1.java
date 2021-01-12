public class Question1{
    public static void main(String args[]){
        int arr1[] = new int[]{1,5,2,8,3,5,8,3,2};
        int arr2[] = new int [arr1.length];
        
        int n = arr1.length-1;
        //Method 1 
        for(int i=0;i<=arr1.length-1;i++){
            arr2[i] = arr1[n-i];
        }
        
        System.out.println("Array 1 is :");
        for(int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Reversed array is :");
        for(int i : arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        //Method 2 
        int arr3[];
        arr3 = arr1;
        int N = arr3.length;
        for(int i=0; i<N/2; i++){
            int t = arr3[i];
            arr3[i] = arr3[N-i-1];
            arr3[N-i-1] = t;
        }
        System.out.println("Reversed array from method II is :");
        for(int j : arr3){
            System.out.print(j+" ");
        }
    }
}