package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers=new int[50];
    private ArrayList<String>groceryList=new ArrayList<String>(); //declaration
    public void addGroceryItem(String item){
        groceryList.add(item);  //adding
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list"); //get size using .size
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i)); //get element using get(i)
        }
    }
    public void modifyGroceryItem(String currItem,String newItem){
        int position=findItem(currItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);  //set element using position
        System.out.println("Grocery item "+(position+1)+" has been modified");
    }

    public void removeGroceryItem(String item){
      int position=findItem(item);
      if (position>=0){
          removeGroceryItem(position);
      }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    //initial way when position was being extracted
//    public String findItem(String searchItem){
////        boolean exists=groceryList.contains(searchItem);
//        int position=groceryList.indexOf(searchItem);
//        if(position>=0){
//            return groceryList.get(position);
//        }
//        return null;
//    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position=groceryList.indexOf(searchItem);
        return position >= 0;
    }
}
