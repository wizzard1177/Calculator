public class Actions {

    public int cast(int a, int b,String sign){
        int result = -1;
        switch (sign){
            case "+": result= a + b;
            break;
            case "-": result= a - b;
                break;
            case "*": result= a * b;
                break;
            case "/": result = a / b;
                break;
        }
        return result;
    }
}
