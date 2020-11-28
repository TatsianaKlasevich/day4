package test.klasevich.array.service;

import com.klasevich.array.entity.ArrayWrapper;
import com.klasevich.array.service.SortArrayService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortArrayServiceTest {

    ArrayWrapper array;
    ArrayWrapper sortedArray;
    SortArrayService sortArray;


    @BeforeClass
    public void setUp() {
        int [] numbers = {1, 3, 5, 7, 4, 7};
        array = new ArrayWrapper(numbers);
        Arrays.sort(numbers);
        sortedArray = new ArrayWrapper(numbers);
        SortArrayService sortArray = new SortArrayService();
    }

    @Test
    public void testBubbleSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test
    public void testChoiceSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test
    public void testShellSort() {
        ArrayWrapper actual = sortArray.BubbleSort(array);
        ArrayWrapper expected = sortedArray;
        assertEquals(actual, expected);
    }
}