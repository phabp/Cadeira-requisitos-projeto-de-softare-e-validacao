package chainOfResponsabilities;

public class Main {

    public static void main(String[] args) {

        Handler h1 = new PositiveHandler();
        Handler h2 = new EvenHandler();

        h1.setNext(h2);

        h1.handle(10);
    }
}
