public class Main {
    public static void main(String[] args) {
        Test obj = new Test(); // Create Test instance
        System.out.println(obj.adder(5, 10));

        Swapper obj2 = new Swapper();
        obj2.firstValue = 10;
        obj2.secondValue = 5;
        obj2.swap();
        System.out.println("First Value " + obj2.firstValue + " Second Value " + obj2.secondValue);

        BinaryConversion.convert(10);

    }
}

class Test {
    public int adder(int a, int b){
        return a + b;
    }
}

class Swapper{
    int firstValue;
    int secondValue;
    int temp;
    public void swap(){
        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;
    }
}

class BinaryConversion{
    public static void convert(int n){
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    
    }
}

class Pyramid{
    public static void print(int n){
        // 4 rows, 7 cols
        // 3 rows 5 cols
        // 2 rows, 3 cols,
        // 1 row, 1 col

        int numCols = 2*(n-1) + 1;

        int[][] array = new int[n][numCols];
    }
}