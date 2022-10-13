package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list;

    @Test
    public void deduplicate() {
        List<Integer> expected = Arrays.asList(1,2,4,5);
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);

        Mockito.when(deduplicator.deduplicate(list)).thenReturn(Arrays.asList(1,2,4,5));
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void testBug5_2(){
        List<Integer> list = Arrays.asList(1,2,4,2);
        List<Integer> expected = Arrays.asList(1,2,4);

        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(list)).thenReturn(Arrays.asList(1,2,4));

        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }

    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,2,5);
    }
}
