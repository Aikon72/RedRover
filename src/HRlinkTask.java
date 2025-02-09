import java.util.Scanner;
public class HRlinkTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int tmp;
        int gameCount;
        if (y > x) {
            tmp = y;
            y = x;
            x = tmp;
        }
        if (x >= z) {
            if (x >= (y + 2)) {
                gameCount = 0;
            } else {
                gameCount = 2 - x + y;
            }
            } else if (z - x >= 2) {
                gameCount = z - x;
            } else if (x - y == 0) {
                    gameCount = 2;
                } else {
                    gameCount = 1;
                }
        System.out.println(gameCount);
        }
    }

