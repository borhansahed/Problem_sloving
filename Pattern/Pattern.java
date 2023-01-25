public class Pattern {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern1(int n) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern3(int n) {

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {

                System.out.print(col + 1 + " ");
            }

            System.out.println();
        }
    }

    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(row + " ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n - row; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern6(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++) {

                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {

        for (int row = 0; row < n; row++) {

            for (int spece = 0; spece < n - row - 1; spece++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (row * 2) + 1; col++) {

                System.out.print("*");
            }

            for (int spece = 0; spece < n - row - 1; spece++) {

                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void pattern8(int n) {

        int colN = n;
        for (int row = 0; row < n; row++) {

            for (int spece = 0; spece < row; spece++) {

                System.out.print(" ");
            }

            for (int col = 0; col < (colN * 2) - 1; col++) {

                System.out.print("*");

            }

            for (int spece = 0; spece < row; spece++) {

                System.out.print(" ");
            }

            System.out.println();
            colN--;
        }
    }

    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    static void pattern10(int n) {

        for (int row = 1; row < n * 2; row++) {

            int colStep = row;
            if (row > n)
                colStep = (n * 2) - row;

            for (int col = 0; col < colStep; col++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern11(int n) {

        int start = 1;
        for (int row = 1; row <= n; row++) {

            if (row % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int col = 0; col < row; col++) {

                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();

        }
    }

    static void pattern12(int n) {

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <= n - row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
