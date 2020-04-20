package academy.learnprogramming;


public class Main {

    public static void main(String[] args) {
        int number = 5;

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == (number - i)  + 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}














//public class Main{
//
//    public static void main(String[] args) {
//
//        int number = 5;
//        for (int i = 1; i <= number; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = number; i > 0; i--) {  // int i = number gives me an
//            for (int j = 1; j <= i; j++) {  // extra row with 5 *'s. If I
//                System.out.print("*");      // stated int i = (number - 1)
//            }                               // then I would have a peak row
//            System.out.println(" ");        // with 5 *'s then the following
//                                            // row would have only 4 *'s.
//        }
//    }
//}
//
//

//public  class Main {
//
//    public static void main(String[] args) {
//
//        int number = 5;
//
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = number; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}




//public class Main {
//
//    public static void main(String[] args) {
//
//        int number = 5;
//
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }
//        for (int i = (number); i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        }
//    }
//

//    public static void main(String[] args) {
//
//        int number = 3;
//
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for (int i = (number - 1); i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}
