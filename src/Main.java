public class Main  {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Duck d1 = new Duck();
        MallardDuck md1 = new MallardDuck();
        RedheadDuck rd1 = new RedheadDuck();

        d1.display();
        d1.quack();
        md1.display();
        d1.quack();
        rd1.display();

    }


}
