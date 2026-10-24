public class SecondTest {
    public static void main(String[] args){
        System.out.println("In main");
        SayHello.PrintMessage();

        SayHello Speaker1 = new SayHello();
        SayHello Speaker2 = new SayHello();

        Speaker1.a = 5;
        Speaker1.b = 10;

        Speaker2.a = 8;
        Speaker2.b = 15;

        int result1 = Speaker1.Adder();
        int result2 = Speaker2.Adder();
        
        System.out.println(result1);
        System.out.println(result2);


    }
}

class SayHello{
    int a;
    int b;
    public static void PrintMessage(){
        System.out.println("In Say Hello");
    }
    public int Adder(){
        return a + b;
    }
}