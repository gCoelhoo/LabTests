package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void filter(){
        List<Integer> expected = Arrays.asList(1,3,5,7,9);
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        class StubFilter implements GenericListFilter{
            @Override
            public boolean accept(Integer number){
                return number%2==1;
            }
        }

        StubFilter stubFilter = new StubFilter();
        ListFilterer listFilterer = new ListFilterer(stubFilter);
        List<Integer> res = listFilterer.filter(list);

        Assertions.assertEquals(expected, res);
    }
}
