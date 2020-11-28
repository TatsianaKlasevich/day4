package test.klasevich.array.creator;

import com.klasevich.array.creator.FillArray;
import com.klasevich.array.entity.ArrayWrapper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FillArrayTest {

    FillArray fillArray;
    ArrayWrapper arrayWrapper;

    @BeforeClass
    public void setUp() {
        fillArray = new FillArray();
        arrayWrapper = new ArrayWrapper();
    }

    @Test
    public void testFillFromFile() {
        String fileName = "data/file.txt";
        ArrayWrapper actual = fillArray.fillFromFile(arrayWrapper,fileName);
        ArrayWrapper expected = new ArrayWrapper(new int[]{15,24,45,65,32,45});
        assertEquals(actual,expected);
    }
}