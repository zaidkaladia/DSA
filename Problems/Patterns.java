import javax.sound.midi.Soundbank;

public class Patterns {
    public static void main(String[] args) {
        pattern18(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));   
        }
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = n-1; k >0; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+ "*".repeat(i));
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(i)+ "*".repeat(n-i));
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(i)+"*".repeat(i-1));
        }
    }
    static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(i)+"*".repeat(n-i)+"*".repeat(n-i-1));
        }
    }
    static void pattern10(int n){
        for (int i = 1; i <= n; i++) {
            // System.out.println(" ".repeat(n-i)+"* ".repeat(i));
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern11(int n){
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k<n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k<n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            // System.out.println(" ".repeat(n-i)+"* ".repeat(i));
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for (int i = 1; i <= n; i++) {
            // System.out.println(" ".repeat(n-i)+"* ".repeat(i));
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                if(i==n && k<i) System.out.print("**");
                else if(k == 1 || k==i || i==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k<n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i==n && j<i) System.out.print("**");
                else if(j == 1 || j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for (int i = 1; i <= n-1; i++) {
            // System.out.println(" ".repeat(n-i)+"* ".repeat(i));
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                if(i==n && k<i) System.out.print("**");
                else if(k == 1 || k==i || i==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k<n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
    }

    static void pattern17(int n){
        for (int i = 1; i <=n; i++) {   
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k>0; k--) {
                System.out.print(k);   
            }
            for (int l = 2; l<=i; l++) {
                System.out.print(l);   
            }
            System.out.println();
        }
        for (int i = n-1; i>0; i--) {   
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k>0; k--) {
                System.out.print(k);   
            }
            for (int l = 2; l<=i; l++) {
                System.out.print(l);   
            }
            System.out.println();
        }
        
    }
    static void pattern18(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" ".repeat(2));
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();   
        }
        // for (int i = n; i >= 0; i--) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(" ".repeat(2));
        //     }
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();   
        // }
    }
}