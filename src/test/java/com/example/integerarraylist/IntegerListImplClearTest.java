package com.example.integerarraylist;

import com.example.integerarraylist.integerlist.IntegerList;
import com.example.integerarraylist.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerListImplClearTest {

    @Test
    public void isEmptyShouldReturnTrueAfterClear() {
        IntegerList out = new IntegerListImpl();
        out.add(1);
        out.clear();
        assertTrue(out.isEmpty());
    }
}
