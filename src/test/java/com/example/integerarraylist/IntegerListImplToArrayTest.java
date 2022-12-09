package com.example.integerarraylist;

import com.example.integerarraylist.integerlist.IntegerList;
import com.example.integerarraylist.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntegerListImplToArrayTest {

    @Test
    void shouldReturnStringsArray() {
        IntegerList out = new IntegerListImpl();
        out.add(1);
        out.add(2);
        out.add(3);

        Integer[] actual = new Integer[]{1, 2, 3};
        Integer[] expected = out.toArray();

        assertArrayEquals(expected, actual);
    }
}