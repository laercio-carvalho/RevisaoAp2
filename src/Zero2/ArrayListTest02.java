package Zero2;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //Aqui estamos declarando os valores do vetor
        int vetor[];
        vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        //É a mesma coisa do exemplo anterior mas de forma diferente
        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
