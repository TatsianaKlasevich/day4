package test.klasevich.array.service;

import com.klasevich.array.entity.ArrayWrapper;
import com.klasevich.array.service.Search;
import com.klasevich.array.service.SortArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortArrayTest {

    ArrayWrapper array;
    SortArray sortArray;

    @BeforeClass
    public void setUp() {
        array = new ArrayWrapper(new int[]{1, 3, 5, 7, 4, 7});
        SortArray sortArray = new SortArray();
    }

    @Test
    public void testBubbleSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = new ArrayWrapper(new int[]{1, 3, 4, 5, 7, 7});
        assertEquals(actual, expected);
    }

    @Test
    public void testChoiceSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = new ArrayWrapper(new int[]{7, 7, 5, 4, 3, 1});
        assertEquals(actual, expected);
    }

    @Test
    public void testShellSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = new ArrayWrapper(new int[]{1, 3, 4, 5, 7, 7});
        assertEquals(actual, expected);
    }
}
