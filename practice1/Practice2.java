import java.util.*;


public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int intLine = Integer.parseInt(line);
        List<String> lists = new ArrayList<>();
        for(int i = 0; i < intLine; i++) {
            String line2 = sc.nextLine();
            lists.add(line2);
        }
        for(String list : lists) {
            System.out.println(list);
        }
    }
}