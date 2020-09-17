public class Line {
    private String in;
    private int a;
    private int b;
    private String sign;

    public void convertToNam(String str){
        if (str.startsWith("/"))
            ConsoleCommand.com(str);
        checkSign(str);
        String[] tokens = in.split(" ");
        a = Integer.valueOf(tokens[0]);
        b = Integer.valueOf(tokens[1]);
        checkNam(a,b);
    }

    private void checkNam(int a ,int b){
        try {
            if (a>10||b>10|a<1|b<1) {
                throw new Exception("Числа должны быть от 1 до 10.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkSign(String str){
        if (str.contains("+")) {
            sign = "+";
            in = str.replace(sign, " ");
        }
            else
        if (str.contains("-")) {
            sign="-";
            in = str.replace(sign, " ");
        }
            else
        if (str.contains("*")) {
            sign="*";
            in = str.replace(sign, " ");
        }
            else
        if (str.contains("/")) {
            sign="/";
            in = str.replace(sign, " ");
        }
        else
            try {
                throw new Exception("Ошибка в ввода.");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getSign() {
        return sign;
    }
}
