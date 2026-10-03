import java.util.Scanner;
class WasteCollection
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the vehicle number:");
          int vehicleNumber=sc.nextInt();
          System.out.println("enter the waste collected in kg:");
          double wasteCollected=sc.nextDouble();
          System.out.println("enter the collection points:");
          int collectionPoints=sc.nextInt();
          System.out.println("enter the vehicle status:");
          char vehicleStatus=sc.next().charAt(0);
          System.out.println("The vehicle num is:" +vehicleNumber);
          System.out.println("The waste collected is:" +wasteCollected);
          System.out.println("The collection points are:" +collectionPoints);
          System.out.println("The vehicle status is:" +vehicleStatus);
    }
}