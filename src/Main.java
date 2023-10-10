import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int i = 0;

        for(String x : words) {
            if(x.contains("1") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") ||
               x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9") ) {
                System.out.println(i + 1 + ": " + x);
            }
            i++;
        }
    }
}
