public class Actions {

    public int cast(Number[] numbers,String sign){
        if (numbers[0].isRimFlag()!=numbers[1].isRimFlag()){
            try {
                throw new Exception("Вводимые данные должны быть одного типа.");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }

        int result = numbers[0].getX();
        int b = numbers[1].getX() ;
        switch (sign){
            case "+": result += b;
            break;
            case "-": result -= b;
                break;
            case "*": result *= b;
                break;
            case "/": result /= b;
                break;
        }
        return result;
    }
}
