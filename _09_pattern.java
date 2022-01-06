import java.util.Scanner;
public class _09_pattern {
    public static void main(String[] args) {
        //  ------------------------------------------------------------------
//        print solid Rectangle
//                  *****
//                  *****
//                  *****
//                  *****
//        First methods----
//       for (int i=1;i<=4;i++){

//            System.out.println("****");
//            Second method----
//
//         for(int i=1;i<=4;i++) {
//             for (int j = 1; j <= 4; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

        //-----------------------------------------------------------------------------------
//  2.Print Hollow Rectangle
//        *****
//        *   *
//        *   *
//        *****

//        int n = 4;
//        int m = 5;
//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || i == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("*");
//        }

//-----------------------------------------------------------------------------------
//
//3.Print Half Pyramid
//
//                *
//                **
//                ***
//                ****
//
//        int a=4;
//        for(int i=1; i<=a;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//---------------------------------------------------------------------------------------------

//4.Inverted Half Pyramind
//                ****
//                ***
//                **
//                *

//        int n=4;
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//-------------------------------------------------------------------------------------------------
//
//5.inverted Hlaf Pyramid(rotated by 180 deg)
//
//                 *
//                **
//               ***
//              ****
//  int n=4;
//for (int i=1;i<=n;i++){
//    for (int j=1;j<=n-i;j++){
//        System.out.print(" ");
//    }
//    for(int j=1;j<=i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
//      }


//-----------------------------------------------------------------------------------------------

//        6.Half pyramid with Numbers
//
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

//
//  int n=5;
// for (int i=1;i<=n;i++){
//    for (int j=1;j<=i;j++){
//        System.out.print(j + " ");
//    }
//
//    System.out.println();
//  }


//  ------------------------------------------------------------------------------------------------
//
//       7. Inverted half pyramid with numbers
//                1 2 3 4 5
//                1 2 3 4
//                1 2 3
//                1 2
//                1
//
////
//         int n=5;
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=n-i+1;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//



    }
}

