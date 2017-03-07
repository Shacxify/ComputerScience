import java.util.*;
public class SumOfBlocks
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of floors: ");
        int setPoint = input.nextInt();
        int rooms = 0;
        int floor = 0;
        System.out.println("The number of rooms is " + getRooms(setPoint, floor, rooms));

    }

    public static int getRooms(int setPoint, int floor, int rooms){
        if (setPoint == 0){
            return 0;
        }
        floor += 1;
        rooms += floor;
        if(floor >= setPoint ){
            return rooms;
        }

        else{
            return getRooms(setPoint, floor, rooms);
        }
    }
}

