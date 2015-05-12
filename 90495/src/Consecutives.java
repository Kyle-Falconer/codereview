import java.util.ArrayList;
import java.util.List;

public class Consecutives {

    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        ArrayList<Integer> range = inclusiveRange(start, end);
        System.out.println(joinList(range, "\t"));
    }

    public static ArrayList<Integer> inclusiveRange(int a, int b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(a);
        if (a != b) {
            int i = a;
            int step = (a < b) ? +1 : -1;
            do {
                i += step;
                result.add(i);
            } while (i != b);
        }
        return result;
    }

    public static String joinList(List<Integer> list, String separator){
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
            sb.append(separator);
        }
        return sb.toString();
    }
}
