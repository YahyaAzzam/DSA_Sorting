import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sort_Array <T>{

int[] myarr;
Sort sorter; 

public void initialize(String path) throws IOException, InterruptedException{
    BufferedReader reader = new BufferedReader(new FileReader(path)); 
    String line=reader.readLine();
    String[] elements = line.split(",");
    myarr = new int[elements.length];
    for (int i = 0; i < elements.length; i++) {
        myarr[i] = Integer.parseInt(elements[i].trim());
    }   
}

public T Simple_Sort(boolean opt){

sorter=new Insertion();
int[][] arr= sorter.sort(myarr);
int size=arr.length;

if(opt){
    return (T) arr[size-1];
}
else{
    return (T) arr;
}

}

public T Efficient_Sort(boolean opt){

sorter=new Merge();
int[][] arr= sorter.sort(myarr);
int size=arr.length;

if(opt){
    return (T) arr[size-1];
}
else{
    return (T) arr;
}


}

public T Non_Comparison_Sort(boolean opt){
    sorter=new Radix();
    int[][] arr= sorter.sort(myarr);
    int size=arr.length;
    
    if(opt){
        return (T) arr[size-1];
    }
    else{
        return (T) arr;
    }
}

public T HeapSort(boolean opt){
    sorter=new Heap();
    int[][] arr= sorter.sort(myarr);
    int size=arr.length;
    if(opt){
        return (T) arr[size-1];
    }
    else{
        return (T) arr;
    }
    
}


}
