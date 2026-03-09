package chainOfResponsabilities;

class EvenHandler extends Handler {

    public void handle(int value) {
        if (value % 2 != 0) {
            System.out.println("Número não é par!");
        } else {
            System.out.println("Passou pelo EvenHandler");
            super.handle(value);
        }
    }
}