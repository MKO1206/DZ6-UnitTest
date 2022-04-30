import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        Cashback service = new Cashback();
        double amount = 900;
        double actual = service.remain(amount);
        double expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn150IfAmountIs850() {
        Cashback service = new Cashback();
        double amount = 850;
        double actual = service.remain(amount);
        double expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1000IfAmount0(){
        Cashback service = new Cashback();
        double amount = 0;
        double actual = service.remain(amount);
        double expected = 1000;
        assertEquals(expected, actual);
    }
}