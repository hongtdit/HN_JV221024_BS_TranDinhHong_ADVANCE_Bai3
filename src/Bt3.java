import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {

        Queue<String> aUrls = new ArrayDeque<>();
        while (true) {
            int lastAction;
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim   ");
            System.out.println("2. Khách tiếp theo ");
            System.out.println("3. Thoát");
            lastAction = new Scanner(System.in).nextInt();
            switch (lastAction) {
                case 1:
                    System.out.print("Nhập tên: ");
                    aUrls.add(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    if (!aUrls.isEmpty()) {
                        System.out.println(aUrls.peek());
                    } else {
                        System.out.println("Queue rỗng!");
                    }
                    if (!aUrls.isEmpty()) {
                        aUrls.remove();
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
                    break;
            }
        }
    }
}
