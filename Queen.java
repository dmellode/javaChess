//Daniel Montus, Dean D'Mello
// 2016/05/15
//Queen Subclass
//Movements and errors for queen piece

public class Queen extends ChessPiece
{
    public Queen (String c, char clr)
    {
	super (c, clr, 'q');
	//Calling the superclass "ChessPiece" constructor to set coordinate, the colour and class.
	//Class is set to 'q' for the Queen
    }


    public boolean move (String c, ChessPiece[] [] cp)
    {
	//Changing position of the Queen piece
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


	//Making sure final position is not on a piece of the player's colour
	if (cp [xf] [yf] != null && clr == cp [xf] [yf].getClr ())
	{
	    System.out.println ("Can't land on your own piece.");
	    return false;
	}

	if (Math.abs (xf - xi) == Math.abs (yf - yi))  //Diagonal movement
	{
	    if (dChecker (c, cp))
	    {
		return super.move (c, cp);
	    }
	    else
	    {
		System.out.println ("Piece in the way.");
		return false;
	    }
	}

	else if (xi == xf || yf == yf) //Horizontal/Vertical movement
	{
	    if (cChecker (c, cp))
	    {
		return super.move (c, cp);
	    }
	    else
	    {
		System.out.println ("Piece in the way.");
		return false;
	    }
	}
	else
	{
	    System.out.println ("Queen must move horizontally, vertically, or diagonally.");
	    return false;
	}
    }
}




