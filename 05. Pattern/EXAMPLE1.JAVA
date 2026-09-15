//USING NESTED LOOP- NESTED LOOP IS A LOOP INSIDE ANOTHER LOOP. THE OUTER LOOP EXECUTES ONCE FOR EACH ITERATION OF THE INNER LOOP.
        //PROGRAM TO PRINT THE PATTERN USING NESTED FOR LOOP.
        import java.util.*;
        public class EXAMPLE1{
            public static void main(String args[]){
                int n = 4;
                int m = 5;
        
                //Outer loop for rows.
                for(int i=1; i<=n; i++)
                {
                    //Inner loop for columns
                    for(int j=1; j<=m; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(); // move to next line after each row
                }
            }
        }
