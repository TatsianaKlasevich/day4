package com.klasevich.array.main;

import com.klasevich.array.entity.ArrayWrapper;
import com.klasevich.array.creator.FillArray;
import com.klasevich.array.service.Search;
import com.klasevich.array.service.SortArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {

        ArrayWrapper array = new ArrayWrapper(new int[]{1, 3, 5, 7, 4, 7});
        ArrayWrapper arrayWrapper = new ArrayWrapper();

        FillArray filling = new FillArray();
        ArrayWrapper array1 = filling.fillFromConsole(array);
        ArrayWrapper array2 = filling.fillFromFile(array, "logs/file.txt");
        ArrayWrapper array3 = filling.generateArray(arrayWrapper);

        SortArray sort = new SortArray();
        ArrayWrapper sort1 = sort.BubbleSort(array);
        ArrayWrapper sort2 = sort.ChoiceSort(array);
        ArrayWrapper sort3 = sort.ShellSort(array);

        Search search = new Search();
        int max = search.searchMaxElement(array);
        int min = search.searchMinElement(array);
        ArrayWrapper arrayWrapper0 = search.searchPrimeDigit(array);
        ArrayWrapper arrayWrapper1 = search.searchFibonacci(array);
        ArrayWrapper arrayWrapper2 = search.searchThreeUnique(array);
        int index = search.binarySearch(array, 25);
    }
}
