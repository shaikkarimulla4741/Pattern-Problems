public class PatternProblems {

    public static void main(String[] args) {
        charPattern1(5);
        starPattern1(5);
    }

    static void charPattern8(int n) {
        for (int row = 1, c = 'E'; row <= n; row++, c--) {
            int p = c;
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++, p--) {

                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    static void charPattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = row, p = 'A'; col <= n; col++, p++) {

                System.out.print((char) p + " ");
            }
            System.out.println();
        }
    }

    static void charPattern6(int n) {
        for (int row = 0; row <=  n; row++) {
            for (int col = 0, p = 'A'; col <= row; col++, p++) {
                System.out.print((char) p + " ");
            }
            System.out.println();
        }
    }

    static void charPattern5(int n) {
        for (int row = 0, p = 'A'; row <= 2 * n; row++, p++) {
            int loopCol = row > n ? 2 * n - row : row;
            int noOfSpaces = n - loopCol;

            for (int col = 0; col <= noOfSpaces; col++) {
                System.out.print(" ");

            }
            for (int col = 0; col <= loopCol; col++) {
                System.out.print((char) p + " ");
            }
            System.out.println();
        }
    }

    static void charPattern4(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                if (row % 2 == 0) {
                    System.out.print("B");
                }else {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
    }

    static void charPattern3(int n) {
        for (int row = 0, p = 'A'; row <= n; row++, p = p + 2) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    static void charPattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0, p = 'E'; col <= row; col++, p--) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    static void charPattern1(int n) {
        for (int row = 0, p = 'A'; row <= n; row++, p++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
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