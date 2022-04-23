public class Cashback {

    private final double boundary = 1000;

    public double remain(double amount) {
        return boundary - amount % boundary;

    }
}
