
/**
 * Calculates and displays the total carpet cost for a given room.
 * This class uses a RoomSize object to determine the area, then multiplies it 
 * by the cost per square foot to compute the total carpeting cost.
 * Includes methods to return the calculated cost and display all relevant details.
 * 
 * author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/5/2025
 */
public class CarpetCost
{
    private RoomSize size; //-size: RoomSize
    private double costPerSqFt;//-costPerSqFt: double

    /**
     * Constructs a CarpetCost object using a RoomSize object and cost per square foot.
     *
     * @param area the RoomSize object representing the room's dimensions
     * @param cost the cost of carpeting per square foot
     */
    public CarpetCost(RoomSize area, double cost){//+CarpetCost (area:RoomSize, cost:double) 
        size = area;
        costPerSqFt = cost;
    }

    /**
     * Calculates and returns the total cost of carpeting the room.
     * 
     * @return the total cost of the carpet based on area and cost per square foot
     */
    public double getCost(){//+getCost(): double 
        double cost = size.getArea() * costPerSqFt;//HINT-Use size.getArea() for part of this
        return cost;
    }

    /**
     * Returns a string with room dimensions, cost per square foot,
     * and the total carpet cost, formatted for readability.
     * 
     * @return a formatted string with carpet cost details
     */
    public String toString(){//+toString(): String
        //CarpetCost toString() displays the room name, length, width, cost per square foot and total cost
        //Total cost should be formatted with $ and , (HINT – use String.format)
        String str= size + String.format("\nCost per square foot: $%,.2f\nCost of the carpet:$%,.2f\n", costPerSqFt,getCost());
        return str; 
    }

}

