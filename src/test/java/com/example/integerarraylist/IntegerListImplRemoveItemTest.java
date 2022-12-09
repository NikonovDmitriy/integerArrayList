package com.example.integerarraylist;

import com.example.integerarraylist.exceptions.ItemNotExistException;
import com.example.integerarraylist.integerlist.IntegerList;
import com.example.integerarraylist.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerListImplRemoveItemTest {

    private IntegerList out;

    @BeforeEach
    public void setUp() {
        out = new IntegerListImpl();
        out.add(1);
        out.add(2);
        out.add(3);
    }

    @Test
    public void shouldReturnRemovedItem() {
        Integer actual = 2;
        Integer expected = out.removeItem(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowItemNotExistException() {
        assertThrows(ItemNotExistException.class,
                () -> out.removeItem(10));
    }
}
