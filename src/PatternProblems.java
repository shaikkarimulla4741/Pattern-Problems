public class PatternProblems {

    public static void main(String[] args) {
        starPattern1(5);
    }

    static void starPattern6(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern5(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = n-row; col>1; col--) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void starPattern4(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int loopCol = row > n ? 2 * n - row : row;

            int noOfSpaces = n - loopCol;

            for (int col = 0; col < noOfSpaces ; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < loopCol; col++) {
                System.out.print("* ");
            }
            System.out.println();

//            if (row > n) { Using if else without using this "int loopCol = row > n ? 2 * n - row : row;"
//                for (int col = 0; col < row-n; col++) {
//                    System.out.print(" ");
//                }
//                for (int col = 0; col < 2 * n - row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int col = 0; col < n - row; col++) {
//                    System.out.print(" ");
//                }
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            }
        }
    }

    static void starPattern3(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int loopCol = row > n ? 2 * n - row : row;

            for (int col = 0; col < loopCol; col++) {
                System.out.print("* ");
            }
            System.out.println();

//            if (row > n) {
//
//                for (int col = 0; col <= 2 * n - 1 - row; col++) {
//                    System.out.print("* ");
//                }
//            }else {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            }
        }
    }

    static void starPattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern1(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}