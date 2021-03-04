public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        switch (args.length) {
            case 0:
                System.out.println("Arguments are missing! Enter a string as an argument to output to the console.");
                break;
            case 1:
                print(args[0]);
                break;
            default:
                String stringToConsole = String.join(" ", args);
                print(stringToConsole);
        }
    }

    private static void print(String string) {
        System.out.println(string);
    }
}