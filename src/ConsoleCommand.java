public class ConsoleCommand {
    public static void com(String str){
       if (str.startsWith("/end")){
           System.out.println("Сеанс завершен.");
           System.exit(0);
       }

    }
}
