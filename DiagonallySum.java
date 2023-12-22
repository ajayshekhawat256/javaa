public class DiagonallySum {
    public static void Diagonally_Sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum=sum+matrix[i][i];
            sum+=matrix[i][matrix.length-1];
        }
    }
    public static void main(String args[]){
        int sum=0;
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
