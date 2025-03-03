package utils;

import com.example.ktnc_01.utils.lietKe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLietKe {
    lietKe lietKe = new lietKe();
    @Test
    public void test(){
        int exp = 1;
        int act = lietKe.lietKeSO(new int[] {1, 5, 10, 20});

        Assertions.assertEquals(exp, act);

    }
}
