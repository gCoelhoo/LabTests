package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    @Test
    public void acceptTrue(){
        PositiveFilter positiveFilter = new PositiveFilter();

        Assertions.assertTrue(positiveFilter.accept(1));
    }
    @Test
    public void acceptFalse(){
        PositiveFilter positiveFilter = new PositiveFilter();

        Assertions.assertFalse(positiveFilter.accept(-10));
    }
    @Test
    public void acceptTrue2(){
        PositiveFilter positiveFilter = new PositiveFilter();

        Assertions.assertTrue(positiveFilter.accept(0));
    }
}
