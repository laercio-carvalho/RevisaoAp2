package Zero4;
import java.util.ArrayList;

public class ArrayListTest04 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList();

        vetor.add(30);
        vetor.add(1,40);
        vetor.add(40);
        vetor.add(50);
        //Lambda expression Java
        vetor.forEach(i -> System.out.println(" "+i));
    }
}
