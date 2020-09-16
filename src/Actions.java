import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
            case "/": result = (b!=0) ? a/b : -1;
                break;
        }
        return result;
    }
}
