public class Line {
    private String in;
    private int a;
    private int b;
    private String sign;

    public void convertToNam(String str){
        checkSign(str);
        String[] tokens = in.split(" ");
        a = Integer.valueOf(tokens[0]);
        b = Integer.valueOf(tokens[1]);
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
        else System.out.printf("error");
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
