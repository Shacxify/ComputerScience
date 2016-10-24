
public class shapeCreator {
    int num;
    
    public void shapeSet (int n) {
        num = n;
    }

    public  void square() {
        for (int i = 0; i < num; i++) {
            if (i == 0 || i == num - 1) {
                for (int a = 0; a < num; a++) {
                    if (a == num - 1) {
                        println();
                    } else {
                        print();
                    }

                }
            } else {
                print();
                for (int b = 0; b < (num - 2); b++) {
                    System.out.print(" ");
                }
                println();

            }

        }
    }

    public void iTriangle() {
        for (int i = 0; i < num; i++) {
            for (int b = 0; b < ((num - i) - 1); b++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (2 * i); a++) {
                print();
            }
            println();

        }

    }
    
        public void rTriangle() {

        for (int i = 0; i < num; i++) {

            for (int a = 0; a < i; a++) {
                print();
            }
            println();

        }

    }

    public static void print() {
        System.out.print("*");

    }

    public static void println() {
        System.out.println("*");

    }

    public static void spaces() {
        System.out.println(" ");

    }

    public static void clearLines() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }

    }

}
