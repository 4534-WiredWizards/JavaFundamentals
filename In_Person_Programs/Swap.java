public class Swap {
    static int a = 2;
    static int b = 5;
    public static void main(String[] args){
        System.out.println("A: " + a + " B: " + b);
        Swap.swapper();
        System.out.println("A: " + a + " B: " + b);

    }
    public static void swapper(){
        int temp = Swap.a;
        Swap.a = Swap.b;
        Swap.b = temp;
    }
}
