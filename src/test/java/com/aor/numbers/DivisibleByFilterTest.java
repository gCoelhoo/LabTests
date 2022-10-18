package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    @Test
    public void acceptTrue(){
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(2);

        Assertions.assertTrue(divisibleByFilter.accept(10));
    }
    @Test
    public void acceptFalse(){
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(2);

        Assertions.assertFalse(divisibleByFilter.accept(7));
    }
}
