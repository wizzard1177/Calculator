public class Line {
    private String in;
    private int a;
    private int b;
    private String sign;

    public void convert(String str){
        if (str.startsWith("/"))
            ConsoleCommand.com(str);

        checkSign(str);
        String[] tokens = in.split(" ");
        if (tokens.length!=2){
            try {
                throw new Exception("Ошибка формы");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        a = (checkNam(tokens[0]))? Integer.valueOf(tokens[0]) : convertToNumber(tokens[0]);
        b = (checkNam(tokens[1]))? Integer.valueOf(tokens[1]) : convertToNumber(tokens[1]);

    }

    private int convertToNumber(String num){
        int result = -1;
        num = num.toLowerCase();
        try {
            switch (num){
                case "i": result = 1;
                    break;
                case "ii": result = 2;
                    break;
                case "iii": result = 3;
                    break;
                case "iv": result = 4;
                    break;
                case "v": result = 5;
                    break;
                case "vi": result = 6;
                    break;
                case "vii": result = 7;
                    break;
                case "viii": result = 8;
                    break;
                case "ix": result = 9;
                    break;
                case "x": result = 10;
                    break;
                default:
                    throw new  Exception("Выход за пределы допустимых значений.");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
    }
        return result;
    }

    private boolean checkNam(String str){
        boolean result=false;
        try {
            if (Integer.parseInt(str)>10||Integer.parseInt(str)<1)
                throw new Exception("Выход за пределы допустимых значений.");
            result = true;

        }catch (NumberFormatException e){
            result = false;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return result;
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
                throw new Exception("Ошибка формы.");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
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
