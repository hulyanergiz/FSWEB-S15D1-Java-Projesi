import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
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
        System.out.println("scanner has been closed");
        */

    Contact Bob=new Contact("Bob","31415926");
    Contact Alice=new Contact("Alice","16180339");
    Contact Tom=new Contact("Tom","11235813");
    Contact Jane=new Contact("Jane","23571113");

    MobilePhone mobilePhone=new MobilePhone("1212121212");
    mobilePhone.addNewContact(Bob);
    mobilePhone.addNewContact(Alice);
    mobilePhone.addNewContact(Tom);
    mobilePhone.addNewContact(Jane);
    mobilePhone.printContact();

        System.out.println("after remove output");
    boolean afterRemove=mobilePhone.removeContact(Bob);
    mobilePhone.printContact();
        System.out.println("is contact removed?: "+afterRemove);

        System.out.println("query output");
        Contact contact=mobilePhone.queryContact("Jan");
        if(contact!=null){
            System.out.println("name:"+contact.getName()+", phone number:"+contact.getPhoneNumber());
        }else{
            System.out.println("!!query contact-null");
        }

        System.out.println("find contact test 1");
        int index1= mobilePhone.findContact("Bob");
        System.out.println("is contact 1 found? Index: "+index1);

        System.out.println("find contact test 2");
        int index2= mobilePhone.findContact("Jane");
        System.out.println("is contact 1 found? Index: "+index2);


    }
}