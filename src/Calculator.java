import java.util.Scanner;

public class Calculator {
    private String str;
    private Line line;
    private Actions act;
    private int res;


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
            line.convert(str);
            res = act.cast(line.getNumbers(), line.getSign());
            if (line.getNumbers()[0].isRimFlag()) {
                System.out.println("Результат -> " + Converter.toRoman(res));
            }else {
                System.out.println("Результат -> " + res);
            }
            System.out.println("Для завершения рограммы введите /end");
        }
    }
}
