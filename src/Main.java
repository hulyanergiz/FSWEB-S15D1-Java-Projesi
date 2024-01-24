import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        groceryList groceryList1 = new groceryList();
        int command;
        do {
            System.out.println("To stop the application, enter 0. " +
                    "To add a new element enter 1. " +
                    "To remove an element enter 2.");
            command=input.nextInt();
            input.nextLine();
           switch(command) {
               case 1:
                   System.out.println("Enter a new element to add");
                   System.out.println("If more than one element will be added, enter ',' between them");
                   String addedItem = input.nextLine();
                   groceryList1.addItems(addedItem);
                   break;

               case 2:
                   System.out.println("Enter the element you want to remove from the array");
                   System.out.println("If more then one element will be removed, enter ',' between them ");
                   String removedItem = input.nextLine();
                   groceryList1.removeItems(removedItem);
                   break;
               default:
                   System.out.println("0,1,or 2 commands can be entered");
                   break;
           }
            groceryList1.printSorted();
        }while(command!=0);
        input.close();
    }
}