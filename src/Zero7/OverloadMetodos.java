package Zero7;

public class OverloadMetodos {
    public static void main(String[] args) {
        Overload obj = new Overload();
        int a = 2;
        double b = 3.2;
        obj.add(a, a);
        obj.add(b, b);
        System.out.println(obj.x+ " Teste");
        System.out.println(obj.y+ " Teste");
    }
}
