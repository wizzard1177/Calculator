import java.util.Scanner;

public class Calculator {
    String str;
    Line line;
    Actions act;


    Calculator(){
        line = new Line();
        act = new Actions();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Program!");

        while (true) {
            System.out.print("Ввведи пример и нажми ENTER -> ");
            str = scanner.nextLine();
            str = str.replaceAll(" ", "");
            line.convertToNam(str);
            System.out.println("Результат -> " + act.cast(line.getA(), line.getB(), line.getSign()));
            System.out.println("Для завершения рограммы введите /end");
        }
    }
}
