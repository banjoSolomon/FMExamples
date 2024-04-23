public class Example1 {
    public static void main(String[] args) {
        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1)\\d{8}";
        String number = "2367894234";
        if(!number.matches(regex)){
            System.err.println("invalid number");
            System.exit(1);
        }
        System.err.println(number);
    }


}
