package selfStudy;

public class Tast {

    public class Person {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
    }

    public class Calculator {
        private int sellRate;
        private int buyRate;

        public int getSellRate() {
            return sellRate;
        }
        public void setSellRate(int sellRate) {
            this.sellRate = sellRate;
        }
        public int getBuyRate() {
            return buyRate;
        }
        public void setBuyRate(int buyRate){
            this.buyRate = buyRate;
        }
    }

//    public static void main(String[] args){
//        //create a new object class person
//        Person person1= new Person();  //this call default constructor
//        person1.setName("John");
//        person1.setAge(20);
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//
//        Calculator cal = new Calculator();
//        cal.setSellRate(10);
//    }
}



