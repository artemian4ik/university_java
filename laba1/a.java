/**
* Laboratory Work number 1
* @author ArtemZolotopup
* @version 1.0
*/

public class a {
    /**
    Inicilization class
    * @see a
     */
    public static void main(String[] args) { 

        System.out.println("Group: 535 ST 2");
        System.out.println("Student: Zolotopup Artem Sergeevich");
        System.out.println("Variant: 2");
        System.out.print("**********");
        System.out.print("  ");
        System.out.print("    **    ");
        System.out.print("  ");
        System.out.println("********* ");

        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7-i; j++)
                System.out.print(" ");
            System.out.print("**");
            
            for(int j = 10-i; j < 13; j++)
                System.out.print(" ");
            ////////////////////////////////

            for(int j = 0; j < 3-i; j++)
            {
                 System.out.print(" ");
            }
            System.out.print("*");

            for(int j = -1; j < i && i < 4; j++)
            {
                 System.out.print(" ");
            }
            
            for(int j = 11+i; j > 10 && i < 4; j--)
            {
                System.out.print(" ");
            }
            if(i == 4) System.out.print("********");
            if(i < 5) System.out.print("*");
            else System.out.print("        *");
            
            for(int j = 0; j < 3-i; j++)
            {
                 System.out.print(" ");
            }
            
            for(int j = 0; j < 2; j++)
            {
                 System.out.print(" ");
            }

            for(int j = 0; j < i+1; j++)
            {
                 System.out.print(" ");
            }
            
            System.out.print("**");
            System.out.println("");
        }
        System.out.print("**********  ");
        System.out.print("*        *  ");
        System.out.println(" *********");
    }
}

/*
1. [4] [5]
1. [3] [6]
1. [2] [7]
 */