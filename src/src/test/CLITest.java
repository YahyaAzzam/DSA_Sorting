package test;

import com.company.CLI;
import com.company.Sort_Array;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

class CLITest {
    CLI cli =new CLI();
    Sort_Array MySorter=new Sort_Array<>();
//    @Test
//    public void test_empty_Efficient_sort() throws IOException, InterruptedException {
//         MySorter.initialize("test_empty.txt");
//         int []answer=(int[]) MySorter.Efficient_Sort(true);
//        assertEquals("Testing empty array", answer.length, 0);
//    }

//    @Test
//    public void test_empty_heap_sort() throws IOException, InterruptedException {
//        MySorter.initialize("test_empty.txt");
//        int []answer=(int[]) MySorter.HeapSort(true);
//        assertEquals("Testing Dijkstra 1", answer.length, 0);
//    }
//    @Test
//    public void test_empty_Non_Comparison_Sort() throws IOException, InterruptedException {
//        MySorter.initialize("test_empty.txt");
//        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
//        assertEquals("Testing Dijkstra 1", answer.length, 0);
//    }
//    @Test
//    public void test_empty_Simple_Sort() throws IOException, InterruptedException {
//        MySorter.initialize("test_empty.txt");
//        int []answer=(int[]) MySorter.Simple_Sort(true);
//        assertEquals("Testing Dijkstra 1", answer.length, 0);
//    }


    @Test
    public void test1_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test1.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[0], 0);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[99999], 10000);
    }
    @Test
    public void test1_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test1.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[0], 0);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[99999], 10000);
    }
    @Test
    public void test1_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test1.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[0], 0);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[99999], 10000);
    }
    @Test
    public void test1_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test1.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[0], 0);
        assertEquals("Testing 100K_with_many_same_numbers_all+VE ", answer[99999], 10000);
    }
    @Test
    public void test2_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test2.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[0], -10);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[999], 10);
    }
    @Test
    public void test2_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test2.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[0], -10);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[999], 10);
    }
    @Test
    public void test2_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test2.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[0], -10);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[999], 10);
    }
    @Test
    public void test2_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test2.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[0], -10);
        assertEquals("Testing 1k_with_many_same_numbers_some-VE ", answer[999], 10);
    }

    @Test
    public void test3_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test3.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing same elm ", answer[0], 100);
        assertEquals("Testing same elm ", answer[500], 100);
        assertEquals("Testing same elm ", answer[100], 100);
        assertEquals("Testing same elm ", answer[999], 100);
    }
    @Test
    public void test3_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test3.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing same elm ", answer[0], 100);
        assertEquals("Testing same elm ", answer[500], 100);
        assertEquals("Testing same elm ", answer[100], 100);
        assertEquals("Testing same elm ", answer[999], 100);
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
    public void test3_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test3.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing same elm ", answer[0], 100);
        assertEquals("Testing same elm ", answer[500], 100);
        assertEquals("Testing same elm ", answer[100], 100);
        assertEquals("Testing same elm ", answer[999], 100);
    }
    @Test
    public void test4_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test4.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 10k elm in small rang", answer[0], 10000);
        assertEquals("Testing 10k elm in small rang", answer[2000], 10001);
        assertEquals("Testing 10k elm in small rang", answer[8000], 10004);
        assertEquals("Testing 10k elm in small rang", answer[9999], 10005);
    }
    @Test
    public void test4_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test4.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 10k elm in small rang", answer[0], 10000);
        assertEquals("Testing 10k elm in small rang", answer[2000], 10001);
        assertEquals("Testing 10k elm in small rang", answer[8000], 10004);
        assertEquals("Testing 10k elm in small rang", answer[9999], 10005);
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
    public void test4_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test4.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 10k elm in small rang", answer[0], 10000);
        assertEquals("Testing 10k elm in small rang", answer[2000], 10001);
        assertEquals("Testing 10k elm in small rang", answer[8000], 10004);
        assertEquals("Testing 10k elm in small rang", answer[9999], 10005);
    }

    @Test
    public void test5_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test5.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[0], -9995);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[999], -10);
    }
    @Test
    public void test5_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test5.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[0], -9995);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[999], -10);
    }
    @Test
    public void test5_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test5.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[0], -9995);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[999], -10);
    }
    @Test
    public void test5_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test5.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[0], -9995);
        assertEquals("Testing 1K_with_many_same_numbers_all-VE ", answer[999], -10);
    }


    @Test
    public void test6_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test6.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 1M number ", answer[0], -10);
        assertEquals("Testing 1M number ", answer[999999], 10);
    }
    @Test
    public void test6_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test6.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 1M number ", answer[0], -10);
        assertEquals("Testing 1M number ", answer[999999], 10);
    }
    @Test
    public void test6_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test6.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1M number ", answer[0], -10);
        assertEquals("Testing 1M number ", answer[999999], 10);
    }
    @Test
    public void test6_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test6.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 1M number ", answer[0], -10);
        assertEquals("Testing 1M number ", answer[999999], 10);    }


    @Test
    public void test7_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test7_reverse_numbers.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("Testing 1M_reversed array", answer[0], 1);
        assertEquals("Testing 1M_reversed array ", answer[999999], 1000000);
    }
    @Test
    public void test7_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test7_reverse_numbers.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("Testing 1M_reversed array", answer[0], 1);
        assertEquals("Testing 1M_reversed array ", answer[999999], 1000000);
    }
    @Test
    public void test7_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test7_reverse_numbers.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("Testing 1M_reversed array", answer[0], 1);
        assertEquals("Testing 1M_reversed array ", answer[999999], 1000000);
    }
    @Test
    public void test7_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test7_reverse_numbers.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("Testing 1M_reversed array", answer[0], 1);
        assertEquals("Testing 1M_reversed array ", answer[999999], 1000000);
    }
    @Test
    public void test8_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test8.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }
    @Test
    public void test8_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test8.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }
    @Test
    public void test8_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test8.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }
    @Test
    public void test8_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test8.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }
    @Test
    public void test9_M_Efficient_sort() throws IOException, InterruptedException {
        MySorter.initialize("test9_sorted_numbers.txt");
        int []answer=(int[]) MySorter.Efficient_Sort(true);
        assertEquals("testing sorted number", answer[0], 1);
        assertEquals("testing sorted number", answer[999999],1000000);
    }
    @Test
    public void test9_Simple_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test9_sorted_numbers.txt");
        int []answer=(int[]) MySorter.Simple_Sort(true);
        assertEquals("testing sorted number", answer[0], 1);
        assertEquals("testing sorted number", answer[999999],1000000);
    }
    @Test
    public void test9_HeapSort() throws IOException, InterruptedException {
        MySorter.initialize("test9_sorted_numbers.txt");
        int []answer=(int[]) MySorter.HeapSort(true);
        assertEquals("testing sorted number", answer[0], 1);
        assertEquals("testing sorted number", answer[999999],1000000);
    }
    @Test
    public void test9_Non_Comparison_Sort() throws IOException, InterruptedException {
        MySorter.initialize("test9_sorted_numbers.txt.txt");
        int []answer=(int[]) MySorter.Non_Comparison_Sort(true);
        assertEquals("small size 10", answer[0], 1);
        assertEquals("small size 10", answer[9],10);
    }
}