import java.util.Scanner;

class ChangeMatrix{
    /*
     * modifyFirstRowFirstColumn function takes input as matrix and modifies
     * first row and first column of matrix to zero if any element of that
     * row or column is zero
     */
    static void modifyFirstRowFirstColumn(int matrix[][]){
       // booleans to check if there are any 0 in first row and column
        boolean row_flag = false;
        boolean column_flag = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == 0 && matrix[i][j] == 0){
                    row_flag = true;
                }
                
                if(j == 0 && matrix[i][j] == 0){
                    column_flag = true;
                }
                
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //function call to modify matrix according to first row and first column
        modifyMatrix(matrix, row_flag, column_flag);
    }

    /*
     * modifyMatrix takes matrix and two booleans as input, modifies matrix according to 
     * first row and column then at the end modifies matrix for first row and column
     */
    static void modifyMatrix(int matrix[][], boolean row_flag, boolean column_flag){

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0 ){
                    matrix[i][j] = 0;
                }
            }
        }
        //modifies first row if there was 0
        if(row_flag == true){
            for(int i = 0 ; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }        
        //modifies first column if there was 0
        if(column_flag == true){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    // function to print a 2D matrix
    static void printMatrix(int matrix[][]){
        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print( matrix[i][j] +" " );
            }
            System.out.println();
        }
    }
    // funtion to scan the input matrix from user
    static int[][] scanInputMatrix(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");

        //scanning number of rows and columns
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        // check if rows or columns entered are less than 1
        if(rows <= 0 || columns <=0 ){
            System.out.println("Rows or Column cannot be less than 1");
            System.exit(1);
        }

        int matrix[][] = new int[rows][columns];
        System.out.println("Enter the elements of Matrix:");

        //scanning elements of matrix
        for(int i=0; i < rows; i++){
            for(int j=0; j < columns; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    public static void main(String args[]){
       //function call to scan the matrix
        int matrix[][] = scanInputMatrix();

        System.out.println("Before Modification");
        printMatrix(matrix); //output matrix before modificaiton
        
        modifyFirstRowFirstColumn(matrix);//function call to modify the matrix

        System.out.println("After Modification of Matrix");
        printMatrix(matrix);//output matrix after modification
    }
}

/*
   Test case 1:
                rows = 3
                columns = 3

                Before Modification
                0 1 1
                1 1 1
                1 1 1

                After Modification of Matrix
                0 0 0 
                0 1 1 
                0 1 1

    Test case 2:
                rows = 0
                columns = 0
                Rows or Column cannot be less than 1
    
   Test case 3:
                rows = 4
                columns = 4

                Before Modification
                1 0 1 0 
                1 0 0 1 
                1 1 0 1 
                1 0 1 0 

                After Modification of Matrix
                0 0 0 0 
                0 0 0 0 
                0 0 0 0 
                0 0 0 0 

    Test case 4:
                rows = -1
                columns = 3
                Rows or Column cannot be less than 1
    
     Test case 5:
                rows = 2
                columns = 2

                Before Modification
                0 1 
                1 1 

                After Modification of Matrix
                0 0 
                0 1 
*/