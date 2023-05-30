package test;

import com.company.CLI;
import com.company.Insertion;
import com.company.Sort_Array;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HeapTest {
    Sort_Array MySorter=new Sort_Array<>();




    @Test
    public void test1_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test1.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[0], 0);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[99999], 10000);
    }
    @Test
    public void test2_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test2.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[0], -10);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[999], 10);
    }
    @Test
    public void test3_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test3.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing same elm ", answer[0], 100);
        assertEquals("Testing same elm ", answer[500], 100);
        assertEquals("Testing same elm ", answer[100], 100);
        assertEquals("Testing same elm ", answer[999], 100);
    }
    @Test
    public void test4_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test4.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 10k elm in small rang", answer[0], 10000);
        assertEquals("Testing 10k elm in small rang", answer[2000], 10001);
        assertEquals("Testing 10k elm in small rang", answer[8000], 10004);
        assertEquals("Testing 10k elm in small rang", answer[9999], 10005);
    }
    @Test
    public void test5_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test5.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[0], -9995);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[999], -10);
    }
    @Test
    public void test6_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test6.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1M number ", answer[0], -10);
        assertEquals("Testing 1M number ", answer[999999], 10);
    }
    @Test
    public void test7_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test7_reverse_numbers.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1M_reversed array", answer[0], 1);
        assertEquals("Testing 1M_reversed array ", answer[999999], 1000000);
    }
    @Test
    public void test8_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test8.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }

    @Test
    public void test9_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test9_sorted_numbers.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("testing sorted number", answer[0], 1);
        assertEquals("testing sorted number", answer[999999],1000000);
    }
    @Test
    public void test10_HeapSort() throws IOException, InterruptedException {
        int [] answer={1,2,8,1,7,5,6,4,88,99,10,55,3,6,4,8,5,6,9,74,122};
        Insertion I=new Insertion();
        int [][]an=I.sort(answer,true);

        assertEquals("Testing manual HeapSort", answer[0], 1);
        assertEquals("Testing manual HeapSort", answer[20], 122);
    }

}