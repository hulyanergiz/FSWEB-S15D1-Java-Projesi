import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class groceryList {
    private ArrayList<String> items;

    public groceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
        String[] splitted=items.split(",");
        for(String item:splitted){
            String trimmed=item.trim();
            if(checkItemIsInList(trimmed)){
                System.out.println(trimmed+"is exist in grocer list");
            }else{
                this.items.add(trimmed);
                sortItems();
            }
        }
    }
    public void removeItems(String items){
        String[] splitted=items.split(",");
        for(String item:splitted){
            String trimmed=item.trim();
            if(!checkItemIsInList(trimmed)){
                System.out.println(trimmed+"is not exist in grocer list");
            }else{
                this.items.remove(trimmed);
            }
        }
    }
    private void sortItems(){
        Collections.sort(items);
    }
    private boolean checkItemIsInList(String trimmed){
        return items.contains(trimmed);
    }

    public void printSorted(){
        for(String item:items){
            System.out.println(item);
        }
    }
}
