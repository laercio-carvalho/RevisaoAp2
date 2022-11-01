package Zero5;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListTest05 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>(Arrays.asList(30,20,21));
        for (int i : vetor) {
            System.out.println(vetor);
        }

    }
}
