public class Adder {
    public static void main(String[] args){
        int x = Adder.add(5, 10);
        System.out.println(x);
    }

    static int add(int a, int b){
        return a + b;
    }
}
