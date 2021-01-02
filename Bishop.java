//Dean D'Mello
// 2016/05/13
//Bishop Subclass
//Movements and errors for bishop piece

public class Bishop extends ChessPiece
{
    public Bishop (String c, char clr)
    {
	super (c, clr, 'b');
	//Calling the superclass "ChessPiece" constructor to set coordinate, the colour and class.
	//Class is set to 'b' for the bishop.
    }


    public boolean move (String c, ChessPiece[] [] cp)
    {
	//Changing position of the bishop piece
	int xf = c.charAt (0) - 'A' + 1;
	int yf = c.charAt (1) - '0';

	int xi = coordi.charAt (0) - 'A' + 1;
	int yi = coordi.charAt (1) - '0';

	//Error checking for out of bounds or no movement
	if (!(finalSpace (c, cp)))
	{
	    System.out.println ("Out of bounds or piece not moved.");
	    return false;
	}


	if (Math.abs (xf - xi) == Math.abs (yf - yi)) //Is it moving diagonally?
	{
	    if (dChecker (c, cp))
	    {
		//Making sure final position is not on a piece of the player's colour
		if (cp [xf] [yf] == null || clr != cp [xf] [yf].getClr ())
		{
		    return super.move (c, cp);
		}
		else
		{
		    System.out.println ("Can't land on your own piece.");
		    return false;
		}
	    }
	    else
	    {
		System.out.println ("Piece in the way.");
		return false;
	    }
	}
	else
	{
	    System.out.println ("Bishop must move diagonally.");
	    return false;
	}
    } //Move method (bishop)
} //Bishop class





