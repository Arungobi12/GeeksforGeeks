import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i=0 ; i<=n ; i++){
            s = i+s ;
        }
        System.out.println(s);
    }
}