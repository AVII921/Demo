import java.util.Scanner;

class NewStar1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }// nestline 
            System.out.println();
        }
    }
}

//    *****
//   *****
//  *****
// *****
//*****

