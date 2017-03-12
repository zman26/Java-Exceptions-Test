public class InvalidShift extends Exception
{
public InvalidShift()
{ super ("Error: This is not an valid shift.");
}

public InvalidShift(int shift)
{
super("Error: "+shift+ " is not a valid shift.");
} 


}