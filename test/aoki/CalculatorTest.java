package aoki;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void multiplyで乗算結果が取得できる() {
        Calculator calc = new Calculator();
        // Calculatorクラスのインスタンス化
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }
    
    @Test
    public void divideで除算結果が取得できる() {
        Calculator calc = new Calculator();
        int expected = 5;
        int actual = calc.divide(10, 2);
        assertThat(actual, is(expected));
    }

}
