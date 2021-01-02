//Kyle Hong
// 2016/05/21
//Knight Subclass
//Movements and errors for knight piece, only piece that can jump over others

public class Knight extends ChessPiece
{
    public Knight (String c, char clr)
    {
	super (c, clr, 'n');
	//calling the superclass(ChessPiece) constructor to set coordinate, colour, and class.
	//Class is set to 'n', representing knight, as a default. 'k' is reserved for king.
    }


    public boolean move (String c, ChessPiece[] [] cp)
    {
	//Changing coordinates in String format into usable integer index
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

	//valid move checker
	//Knight can jump over other pieces, so algorithm only needs to check the final coordinate.
	if (((xf == xi + 2 || xf == xi - 2) && (yf == yi + 1 || yf == yi - 1)) || ((xf == xi + 1 || xf == xi - 1) && (yf == yi + 2 || yf == yi - 2)))
	{
	    if (cp [xf] [yf] == null || cp [xf] [yf].getClr () != clr) //true if the destination is vacant or occupied by an enemy piece
	    {
		return super.move (c, cp);
	    }
	    else
	    {
		System.out.println ("You can't move to where your piece is already at.");
		return false;
	    }
	}
	else
	{
	    System.out.println ("This is an invalid move. Read the rule book again.");
	    return false;
	}
    }
}


