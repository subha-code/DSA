public class CallByValue{
    public static void swap(int a, int b){
        int temp = a;
        a= b;
        b= temp;
        /*System.out.println("a = "+ num1);
        System.out.println("b = "+ num2);*/
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}