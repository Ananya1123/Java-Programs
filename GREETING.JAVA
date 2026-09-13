// WRITE A PROGRAM TO PRINT GREETING('HELLO','NAMASTE','BONJOUR') MESSAGE BASED ON THE CHOICE OF 1,2 OR 3 USING AN SWITCH STATEMENT
    import java.util.Scanner;
    class GREETING{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice 1,2 or 3");
            int variable= sc.nextInt();
            switch(variable){
                case 1:
                    System.out.println("HELLO");
                    break;
                case 2:
                    System.out.println("NAMASTE");
                    break;
                case 3:
                    System.out.println("BONJOUR");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }