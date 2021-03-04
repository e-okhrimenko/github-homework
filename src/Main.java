public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        switch (args.length) {
            case 0:
                System.out.println("Arguments are missing!" + "\n" + "Enter as an argument: only a string or a string and separated by a space " + "\n" + "- the number of times to repeat the output of the line to the console.");
                break;
            case 1:
                print(args[0]);
                break;
            default:
                try {
                    int lastIndex = (args.length - 1);
                    StringBuilder string = new StringBuilder();
                    for (int l = 0; l < lastIndex; l++) {
                        string.append(args[l]).append(" ");
                    }
                    int lastNum = Integer.parseInt(args[lastIndex]);
                    print(string.toString(), lastNum);
                } catch (NumberFormatException e) {
                    String stringToConsole = String.join(" ", args);
                    print(stringToConsole);
                }
        }
    }

    private static void print(String string) {
        System.out.println(string);
    }

    private static void print(String string, int quantity) {
        while (quantity > 0) {
            System.out.println(string);
            quantity--;
        }
    }
}