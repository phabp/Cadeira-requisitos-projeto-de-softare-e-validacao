package chainOfResponsabilities;

class PositiveHandler extends Handler {

    public void handle(int value) {
        if (value < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Passou pelo PositiveHandler");
            super.handle(value);
        }
    }
}