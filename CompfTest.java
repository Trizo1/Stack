import java.util.Scanner;

// Тест для компилятора формул.
public class CompfTest {
    public static void main(String[] args) throws Exception {
        //Compf c = new Compf();
        Calc c = new Calc();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите формулу -> ");
            String str = scan.next();
            char[] chars = str.toCharArray();
            c.compile(chars);
        }
    }
}