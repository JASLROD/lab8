
/**
 * Represents the dimensions of a room, including its name, length, and width.
 * Also provides functionality to calculate and display the area.
 * This class is used by other classes (like CarpetCost) to compute carpet pricing.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/5/2025
 */
public class RoomSize
{
    //primary variables 
    private String name;//-name:String 
    private double length;//-length:double 
    private double width;//-width:double

    /**
     * Constructs a RoomSize object with the given name, length, and width.
     *
     * @param inName  the name of the room
     * @param inLen   the length of the room in feet
     * @param inWidth the width of the room in feet
     */
    public RoomSize(String inName, double inLen, double inWidth){//+RoomSize(inName:String, inLen:double, inWidth:double)
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * Constructs a new RoomSize object by copying the properties of another RoomSize object.
     *
     * @param object2 the RoomSize object to copy
     */
    public RoomSize(RoomSize object2){//+RoomSize(object2:RoomSize)
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Calculates and returns the area of the room.
     *
     * @return the area of the room in square feet
     */
    public double getArea(){//+getArea(): double 
        return length*width;

    }

    /**
     * Returns a string representation of the room, including its name, dimensions, and area.
     *
     * @return a formatted string with room details
     */
    public String toString(){//+toString(): String
        //RoomSize toString() to display name, length, and width using size in the CarpetCost toString()
        String str="\nName: "+ name + "\nLength: "+ length + "\nWidth: "+ width +"\nArea: "+ getArea();
        return str;
    }
}