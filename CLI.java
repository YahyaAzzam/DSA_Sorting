import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;



public class CLI {
    Scanner sc = new Scanner(System.in);
    Sort_Array MySorter=new Sort_Array<>();
    int option;
    boolean returntype;
    FileWriter writer;


    void Welcome() {
        System.out.println("\033[0;31mWelcome to Our Dictionary\n\033[0m");
    }   
    void options() {
        System.out.println("\033[0;31mChoose one of the following algorithms to sort with:\033[0m");
        System.out.println("\033[0;34m1)Insertion Sort.\n2)Merge Sort.\n3)Radix Sort.\n4)Heap Sort.\n\n\nEnter an Option:\033[0m");
    }
    void initialize() throws InterruptedException{
        try{
            System.out.println("\033[0;34mEnter The Path of the Array:\033[0m");
            String path=sc.nextLine();
            MySorter.initialize(path);

        }catch (Exception e){
            System.out.print("\033\143");
            System.out.println("Please Enter a Valid Path!");
            Thread.sleep(2000);
            System.out.print("\033\143");
            this.initialize();
        }
    }
    void option_selector() throws InterruptedException{
        try {
            System.out.print("\033\143");
            this.options();
            option = sc.nextInt();

            if(option<1 || option>4){
                System.out.print("\033\143");
                System.out.println("Please Enter a Valid Option between 1 to 4!");
                Thread.sleep(2000);
                this.option_selector();
            }
            }catch(Exception e){
                System.out.print("\033\143");
                System.out.println("Please Enter a Valid Option between 1 to 4!");
                Thread.sleep(2000);
                sc.nextLine();
                this.option_selector();
            } 
    }
    void type_selector() throws InterruptedException{
        try {
            System.out.print("\033\143");
            System.out.println("\033[0;34mEnter 0 to get intermediate arrays or 1 To get only the final sorted array:\033[0m");
            int opt = sc.nextInt();
            if(opt<0 || opt>1){
                System.out.print("\033\143");
                System.out.println("Please Enter 0 or 1!");
                Thread.sleep(2000);
                this.type_selector();
            }
            if(opt==0){
                returntype=false;
            }else{
                returntype=true;
            }

        }catch(Exception e){
                System.out.print("\033\143");
                System.out.println("Please Enter 0 or 1!");
                Thread.sleep(2000);
                sc.nextLine();
                this.type_selector();
            } 

    }    

    void run() throws IOException, InterruptedException {        
        this.Welcome();
        this.initialize();
        this.option_selector();
        this.type_selector();
        System.out.print("\033\143");
        long start,end;
        switch(option){
            case 1:
                if(returntype){
                    start=System.nanoTime();
                    int arr[]= (int[]) MySorter.Simple_Sort(returntype);
                    end=System.nanoTime();
                    System.out.print("[ ");
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]);
                        if(i!=arr.length-1){
                            System.out.print(", ");
 
                        }
                    }
                    System.out.println(" ]");
                    writer = new FileWriter("InsertionSort.txt",true);
                    writer.write(((end-start))+" "+arr.length+" 1\n");
                    writer.close();
                }else{
                    start=System.nanoTime();
                    int arr[][]= (int[][]) MySorter.Simple_Sort(returntype);
                    end=System.nanoTime();
                    for(int i=0;i<arr.length;i++){
                        System.out.print("[ ");
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]);
                            if(j!=(arr[i].length-1)){
                                System.out.print(", "); 
                            }
                        }
                        System.out.print(" ]\n");
                    }
                    writer = new FileWriter("InsertionSort.txt",true);
                    writer.write(((end-start))+" "+arr[0].length+" "+arr.length+"\n");
                    writer.close();
                }
                break;
            case 2:
                if(returntype){
                    start=System.nanoTime();
                    int arr[]= (int[]) MySorter.Efficient_Sort(returntype);
                    end=System.nanoTime();
                    System.out.print("[ ");
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]);
                        if(i!=arr.length-1){
                            System.out.print(", ");

                        }
                    }
                    System.out.println(" ]");
                    writer = new FileWriter("MergeSort.txt",true);
                    writer.write(((end-start))+" "+arr.length+" 1\n");
                    writer.close();
                }else{
                    start=System.nanoTime();
                    int arr[][]= (int[][]) MySorter.Efficient_Sort(returntype);
                    end=System.nanoTime();
                    for(int i=0;i<arr.length;i++){
                        System.out.print("[ ");
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]);
                            if(j!=(arr[i].length-1)){
                                System.out.print(", "); 
                            }
                        }
                        System.out.print(" ]\n");
                    }
                    writer = new FileWriter("MergeSort.txt",true);
                    writer.write(((end-start))+" "+arr[0].length+" "+arr.length+"\n");
                    writer.close();
                }
                break;
            case 3:
                if(returntype){
                    start=System.nanoTime();
                    int arr[]= (int[]) MySorter.Non_Comparison_Sort(returntype);
                    end=System.nanoTime();
                    System.out.print("[ ");
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]);
                        if(i!=arr.length-1){
                            System.out.print(", ");

                        }
                    }
                    System.out.println(" ]");
                    writer = new FileWriter("RadixSort.txt",true);
                    writer.write(((end-start))+" "+arr.length+" 1\n");
                    writer.close();
                }else{
                    start=System.nanoTime();
                    int arr[][]= (int[][]) MySorter.Non_Comparison_Sort(returntype);
                    end=System.nanoTime();
                    for(int i=0;i<arr.length;i++){
                        System.out.print("[ ");
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]);
                            if(j!=(arr[i].length-1)){
                                System.out.print(", "); 
                            }
                        }
                        System.out.print(" ]\n");
                    }
                    writer = new FileWriter("RadixSort.txt",true);
                    writer.write(((end-start))+" "+arr[0].length+" "+arr.length+"\n");
                    writer.close();
                }
                break;
            case 4:
                if(returntype){
                    start=System.nanoTime();
                    int arr[]= (int[]) MySorter.HeapSort(returntype);
                    end=System.nanoTime();
                    System.out.print("[ ");
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]);
                        if(i!=arr.length-1){
                            System.out.print(", ");

                        }
                    }
                    System.out.println(" ]");
                    writer = new FileWriter("HeapSort.txt",true);
                    writer.write(((end-start))+" "+arr.length+" 1\n");
                    writer.close();
                }else{
                    start=System.nanoTime();
                    int arr[][]= (int[][]) MySorter.HeapSort(returntype);
                    end=System.nanoTime();
                    for(int i=0;i<arr.length;i++){
                        System.out.print("[ ");
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]);
                            if(j!=(arr[i].length-1)){
                                System.out.print(", "); 
                            }
                        }
                        System.out.print(" ]\n");
                    }
                    writer = new FileWriter("HeapSort.txt",true);
                    writer.write(((end-start))+" "+arr[0].length+" "+arr.length+"\n");
                    writer.close();
                }
                break;

        }

}


}