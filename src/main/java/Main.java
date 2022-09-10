import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    boolean calculating = true;
    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command or exit to finish:");

    //Scanner scan = new Scanner(System.in);

    // Following line is not mandatory as the default matches whitespace
    //scan.useDelimiter(" ");



    //String noun = scan.next();
    //System.out.println(noun);
    while(calculating) {
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      String[] commands = input.split(" ");

      switch (commands[0]) {
        case "add":
          int a = Integer.parseInt(commands[1]);
          int b = Integer.parseInt(commands[2]);
          System.out.println(calculator.add(a, b));
          break;
        case "subtract":
          System.out.println(calculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          break;
        case "multiply":
          System.out.println(calculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          break;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(commands[1])));
          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(commands[1])));
          break;
        case "exit":
          calculating = false;
          break;
        default:
          break;
      }
    }
    System.out.println("Thank you for using this calculator. Bye!");
  }

}
