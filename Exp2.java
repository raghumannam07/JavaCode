




public class Exp2 {
    public static void main(String[] args) {
        
    int arr[][]=new int[4][4];
    
    
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
        {

        arr[i][j]=(int)(Math.random()*2);
        System.err.print(arr[i][j]+" ");
    }
    System.err.println("");
}
}
}