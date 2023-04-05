import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {

    public static void selectionSort(ArrayList<String> items) {
        for (int i = 0;i<items.size();i++){
            int minIndex = i;
            for(int j =i;j<items.size();j++){
                if((items.get(j).compareTo(items.get(minIndex))<0)){
                    minIndex = j;
                }
            }
            String tmp = items.get(i);
            items.set(i,items.get(minIndex));
            items.set(minIndex,tmp);
        }


    }


        public static void insertionSort(ArrayList<String> items){
            for(int i = 1;i<items.size();i++){
                int j =i;
                while(((j>0)&&(items.get(j).compareTo(items.get(j-1))<0))){
                    String tmpVal = items.get(j-1);
                    items.set(j-1,items.get(j));
                    items.set(j,tmpVal);

                    j--;
                }

            }

        }
    
  
    
}