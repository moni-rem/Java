package selfStudy.Encapsulation;

import java.util.ArrayList;

import static selfStudy.Encapsulation.Calculator.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        ArrayList<Person> people = new ArrayList<>();
        person1.setName("John");
        person1.setAge(23);

        person2.setName("Nona");
        person2.setAge(25);

        people.add(person1);
        people.add(person2);

        Calculator calculator = new Calculator();
        calculator.setSellRate(EXCHANGE_SELL_RATE_TODAY);
        calculator.setBuyRate(EXCHANGE_BUY_RATE_TODAY);
        String JohnCcy = "USD";
        String NonaCyy = "KHR";
        int amount = 100;//405000

        System.out.println("Cambodia Exchange sellRate Today : " + calculator.getSellRate());
        System.out.println("Cambodia Exchange buyRate Today : " + calculator.getBuyRate());

        for (Person p : people) {

            if (p.getName().equals("John")) {
                if (USD_CCY.equals(JohnCcy)) {
                    amount *= EXCHANGE_BUY_RATE_TODAY;
                    calculator.setCreditAmount(amount);
                }
                System.out.println("Display person's name: " + p.getName());
                System.out.println("Display person's age: " + p.getAge());
                System.out.println(p.getName() + " Sell Rate : " + calculator.getCreditAmount() + " " + KHR_CCY);
            } else {
                if (KHR_CCY.equals(NonaCyy)) {
                    amount = amount / EXCHANGE_BUY_RATE_TODAY;
                    calculator.setCreditAmount(amount);      //block 405000 / 4100 KHR
                }
                System.out.println("Display person's name: " + p.getName());
                System.out.println("Display person's age: " + p.getAge());
                System.out.println(p.getName() + " Sell Rate : " + calculator.getCreditAmount() + " " + USD_CCY);
            }
        }
    }
}
