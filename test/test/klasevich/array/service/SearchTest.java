package test.klasevich.array.service;

import com.klasevich.array.entity.ArrayWrapper;
import com.klasevich.array.service.Search;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchTest {
    ArrayWrapper array;
    Search search;

    @BeforeClass
    public void setUp() {
        array = new ArrayWrapper(new int[]{1, 3, 5, 7, 4, 7});
        search = new Search();
    }

    @Test
    public void testSearchMaxElement() {
        int actual = search.searchMaxElement(array);
        int expected =7;
        assertEquals(actual,expected);
    }

    @Test
    public void testSearchMinElement() {
        int actual = search.searchMinElement(array);
        int expected =1;
        assertEquals(actual,expected);
    }

    @Test
    public void testSearchPrimeDigit() {
        ArrayWrapper actual = search.searchPrimeDigit(array);
        ArrayWrapper expected = new ArrayWrapper(new int[]{3,5,7,7});
        assertEquals(actual,expected);

    }

    @Test
    public void testSearchFibonacci() {
        ArrayWrapper arrayTest = new ArrayWrapper(new int[]{5,34,22,233,610,74});
        ArrayWrapper actual = search.searchFibonacci(arrayTest);
        ArrayWrapper expected = new ArrayWrapper(new int[]{5,34,233,610});
        assertEquals(actual,expected);
    }

    @Test
    public void testSearchThreeUnique() {
        ArrayWrapper arrayTest = new ArrayWrapper(new int[]{235,334,220,233,610,745});
        ArrayWrapper actual = search.searchThreeUnique(arrayTest);
        ArrayWrapper expected = new ArrayWrapper(new int[]{235,610,745});
        assertEquals(actual,expected);
    }

    @Test
    public void testBinarySearch() {
        ArrayWrapper arrayTest = new ArrayWrapper(new int[]{235,334,220,233,610,745});
        int key = 334;
        int actual = search.binarySearch(arrayTest,key);
        int expected = 3;
        assertEquals(actual,expected);
    }
}