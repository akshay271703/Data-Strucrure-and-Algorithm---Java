import java.io.*;
public class Question_a{
    static char chessBoard [][] = new char[8][8];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter queenX-queenY-kingX-kingY");
        String s [] = br.readLine().split("-");
        
        int queenX = Integer.parseInt(s[0]) -1;
        int queenY = Integer.parseInt(s[1]) -1;
        int kingX = Integer.parseInt(s[2]) -1;
        int kingY = Integer.parseInt(s[3]) -1; 
        int i,j,counter;
        //Cross Out horizontal and vertical places where queen sits
        for(i=0;i<=7;i++){
            for(j=0;j<=7;j++){
                if(i==queenY || j==queenX){
                    chessBoard[j][i] = 'X';
                }else{
                    chessBoard[j][i] = '0';
                }
            }
        }
        System.out.println("Current chess position");
        printTable();
        //Right Counter
        counter = 1;

        for(j=queenX+1;j<=7;j++){
            if(queenY-counter>=0){
                chessBoard[j][queenY-counter] = 'X';
            }
            if(queenY+counter<=7){
                chessBoard[j][queenY+counter] = 'X';
            }
            counter++;
        }
        
        System.out.println("After Right Diagonal");
        printTable();

        //Left Counter
        counter=0;
        for(j=queenX;j>=0;j--){
            if(queenX-counter>=0){
                chessBoard[queenX-counter][j] = 'X';
            }
            if(queenX+counter+2<8){
                chessBoard[queenX+counter+2][j] = 'X';
            }
            
            counter++;
        }
        System.out.println("After Left Diagonal");
        printTable();
    }
    public static void printTable(){
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                System.err.print(chessBoard[j][i]+"   ");
            }
            System.err.println();
        }
    }
}