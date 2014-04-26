package aoki;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void multiply�ŏ�Z���ʂ��擾�ł���() {
        Calculator calc = new Calculator();
        // Calculator�N���X�̃C���X�^���X��
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }
    
    @Test
    public void divide�ŏ��Z���ʂ��擾�ł���() {
        Calculator calc = new Calculator();
        int expected = 5;
        int actual = calc.divide(10, 2);
        assertThat(actual, is(expected));
    }

}
