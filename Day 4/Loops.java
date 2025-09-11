
public class Loops {

    // print first ten numbers using for loop 
    static void firstTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // sum of first n natural numbers
    static void sumOfNaturalNumbers(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
    // products of first n natural numbers
    static void productOfNaturalNumbers(int n) {
        int prod=1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        System.out.println("Sum: " + prod);
    }

    // nth table using for loop
    static void nTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    // method for finding the sum of series : 1 + x + x^2 + x^3 + x^4 + ... + x ^(n-1)
    static void series1(int x, int n) {
        int prod = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += prod;
            prod *= x;
        }
        
        System.out.println("Result: " + result);
        
        // OR
        
        // int s=0;
        // for (int i = 0; i < n; i++) {
            //     s += Math.pow(x,i);
            // }
            
            // System.out.println("Result: " + s);
            
        }
        
        // method for finding the sum of series : 1 - x + x^2 - x^3 + x^4 ...
        static void series2(int x, int n) {
            int prod = 1;
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if(i%2 == 0) {
                    result -= prod;
                } else {
                    result += prod;
                }
                prod *= x;
            }
            System.out.println("Result: " + result);
            
            // OR
            
            // int s=0;
            // for (int i = 0; i < n; i++) {
            //     if (i%2 == 0) {
            //         s += Math.pow(x,i);
            //     } else {
            //         s -= Math.pow(x,i);

            //     }
            // }
            
            // System.out.println("Result: " + s);
            
        }

        static void series3(int n) {
            double result = 0;
            for (int i = 1; i < n; i++) {
                result += i+1/i;
            }
            System.out.println("Result: " + result);
        }

        static void pattern1(int n) {
            // *
            // * *
            // * * *
            // * * * *

            for (int r = 1; r <= n; r++) {
                for (int c = 0; c < r; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern2(int n) {
            // * * * *
            // * * *
            // * *
            // *

            for (int r = 1; r <= n; r++) {
                for (int c = n; c >= r; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        static void pattern3(int n) {
            // * * * *
            //   * * *
            //     * *
            //       *

            for (int r = 1; r <= n; r++) {

                for (int s = 1; s < r; s++) {
                    System.out.print("  ");
                }

                for (int c = n; c >= r; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        
        static void pattern4(int n) {
            //       *
            //     * *
            //   * * *
            // * * * *
            
            for (int r = 1; r <= n; r++) {

                for (int s = r; s < n; s++) {
                    System.out.print("  ");
                }

                for (int c = 0; c < r; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        
        static void pattern5(int n) {
            // * * * * 
            //  * * * 
            //   * * 
            //    *

            for (int r = 1; r <= n; r++) {

                for (int s = 1; s < r; s++) {
                    System.out.print(" ");
                }

                for (int c = n; c >= r; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern6(int n) {
            // 1 2 3 4
            // 1 2 3
            // 1 2
            // 1

            for (int r = 0; r < n; r++) {
                for (int c = 1; c <= (n-r); c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        static void pattern7(int n) {
            // 1 2 3 4
            //   1 2 3
            //     1 2
            //       1

            for (int r = 0; r < n; r++) {

                for (int s = 1; s <= r; s++) {
                    System.out.print("  ");
                }

                for (int c = 1; c <= (n-r); c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        static void pattern8(int n) {
            //         1
            //       1 2 1
            //     1 2 3 2 1
            //   1 2 3 4 3 2 1
            // 1 2 3 4 5 4 3 2 1

            for (int r = 1; r <= n; r++) {

                for (int s = r; s < n; s++) {
                    System.out.print("  ");
                }

                for (int c = 1; c <= (r); c++) {
                    System.out.print(c + " ");
                }

                for (int c = r-1; c > 0; c--) {
                    System.out.print(c +" ");
                }
                System.out.println();
            }
        }

        static void pattern9(int n) {

            // * * * *
            // *     *
            // *     *
            // * * * *

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==0 || i == n-1 || j == 0 || j == n-1) {
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        static void pattern10(int n) {

            // * * * *
            // * *   *
            // *   * *
            // * * * *

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==0 || i == n-1 || j == 0 || j == n-1 || i == j) {
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }



    public static void main(String[] args) {
        // firstTenNumbers();
        // sumOfNaturalNumbers(10);
        // productOfNaturalNumbers(10);
        // nTable(15);
        // series1(2, 5); // 1 + 2 + 4 + 8 + 16 = 31
        // series2(2, 5); // 1 - 2 + 4 - 8 + 16 = 11
        // series3(5);    //  0 + (1/2) + (2/3) + ... + (n-1/n)
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(4);
        // pattern6(4);
        // pattern7(4);
        // pattern8(5);
        // pattern9(4);
        pattern10(4);
    }    
}
