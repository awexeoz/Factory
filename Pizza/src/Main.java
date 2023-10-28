import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в нашу пиццерию");
        Scanner scanner = new Scanner(System.in);
        PizzaFactory factory = new PizzaFactory();

        while(true){
            System.out.println("Выберите пиццу");
            System.out.println("1.Пепперони");
            System.out.println("2.Маргарита");
            System.out.println("3.Гавайская");
            System.out.println("4.Выход");
            int ch = scanner.nextInt();

            switch(ch) {
                case 1:
                    Pizza PepperoniPizza = factory.createPizza("Пепперони");
                    PepperoniPizza.prepare();
                    break;
                case 2:
                    Pizza MargheritaPizza = factory.createPizza("Маргарита");
                    MargheritaPizza.prepare();
                    break;
                case 3:
                    Pizza HawaiianPizza = factory.createPizza("Гавайская");
                    HawaiianPizza.prepare();
                    break;
                case 4:
                    System.exit(0);
                }
            }
        }
    }