import java.util.Scanner;

/**
 * Demonstrates calculating the total cost of carpeting a room
 * based on user input for dimensions and cost per square foot.
 * The program creates RoomSize and CarpetCost objects and displays
 * the calculated total cost for each room.
 * 
 *@author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/5/2025
 */
public class CarpetCostDemo
{
    public static void main(String[] args){
        double length, width, cost;
        String name;// name of room
        //cost per square foot
        //RoomSize object called temp
        //temp * cost create CarpetCost object
        //call RoomSize constructor along with cost

        //scanner to enter info
        Scanner keyboard = new Scanner(System.in);
        //enter room 1 info
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        length =  keyboard.nextDouble();
        System.out.printf("Enter room width: ");
        width = keyboard.nextDouble();
        System.out.printf("Enter cost per square foot: ");
        cost = keyboard.nextDouble();

        //create object room1
        RoomSize temp = new RoomSize ( name, length, width);

        CarpetCost room1 = new CarpetCost ( temp, cost);

        //display info of room 1 to screen 
        System.out.println(room1);
        String var = keyboard.nextLine();

        //enter room 2 info
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();

        CarpetCost room2 = new CarpetCost (new RoomSize(name, length, width), cost);
        //display info of room 2 to screen
        System.out.println(room2);
        var = keyboard.nextLine();

    }
}
