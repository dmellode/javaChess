import java.awt.*;
import hsa.Console;
/*Daniel Montus, Kyle Hong, Dean D'mello
2019/05/30
This is the ChessGrpahics class
In this Class each methods draw a Chess Piece and Both Colours of the Chess Piece
*/

public class ChessGraphics
{
	private ChessPiece[] [] board;
	private Console c;
	//2D Array on the Main Method
	public ChessGraphics (ChessPiece[] [] cp, Console c)
	{
	board = cp;
	this.c = c;
	}

	//draw White Rook
	public void drawWRook (int i, int j)
	{
	c.setColor (Color.white);
	c.fillRect (28 + i * 40, 386 - j * 40, 30, 5);
	c.fillRect (28 + i * 40, 384 - j * 40, 6, 2);
	c.fillRect (40 + i * 40, 384 - j * 40, 6, 2);
	c.fillRect (52 + i * 40, 384 - j * 40, 6, 2);
	int[] x = {7 + 23 + i * 40, 9 + 23 + i * 40, 31 + 23 + i * 40, 33 + 23 + i * 40};
	int[] y = {8 + 383 - j * 40, 11 + 383 - j * 40, 11 + 383 - j * 40, 8 + 383 - j * 40};
	c.fillPolygon (x, y, 4);
	c.fillRect (32 + i * 40, 394 - j * 40, 22, 16);
	int[] x1 = {9 + 23 + i * 40, 8 + 23 + i * 40, 32 + 23 + i * 40, 31 + 23 + i * 40};
	int[] y1 = {27 + 383 - j * 40, 29 + 383 - j * 40, 29 + 383 - j * 40, 27 + 383 - j * 40};
	c.fillPolygon (x1, y1, 4);
	c.fillRect (29 + i * 40, 412 - j * 40, 28, 5);
	c.fillRect (26 + i * 40, 417 - j * 40, 34, 5);
	c.setColor (Color.black);
	int[] x2 = {5 + 23 + i * 40, 5 + 23 + i * 40, 35 + 23 + i * 40, 35 + 23 + i * 40, 29 + 23 + i * 40, 29 + 23 + i * 40, 23 + 23 + i * 40, 23 + 23 + i * 40, 17 + 23 + i * 40, 17 + 23 + i * 40, 11 + 23 + i * 40, 11 + 23 + i * 40};
	int[] y2 = {1 + 383 - j * 40, 8 + 383 - j * 40, 8 + 383 - j * 40, 1 + 383 - j * 40, 1 + 383 - j * 40, 3 + 383 - j * 40, 3 + 383 - j * 40, 1 + 383 - j * 40, 1 + 383 - j * 40, 3 + 383 - j * 40, 3 + 383 - j * 40, 1 + 383 - j * 40};
	c.drawPolygon (x2, y2, 12);
	c.drawPolygon (x, y, 4);
	c.drawRect (32 + i * 40, 394 - j * 40, 22, 16);
	c.drawPolygon (x1, y1, 4);
	c.drawRect (29 + i * 40, 412 - j * 40, 28, 5);
	c.drawRect (26 + i * 40, 417 - j * 40, 34, 5);
	}

	//Draw Black Rook
	public void drawBRook (int i, int j)
	{
	c.setColor (Color.black);
	c.fillRect (5 + 23 + i * 40, 3 + 383 - j * 40, 30, 5);
	c.fillRect (5 + 23 + i * 40, 1 + 383 - j * 40, 6, 2);
	c.fillRect (17 + 23 + i * 40, 1 + 383 - j * 40, 6, 2);
	c.fillRect (29 + 23 + i * 40, 1 + 383 - j * 40, 6, 2);
	int[] x = {7 + 23 + i * 40, 9 + 23 + i * 40, 31 + 23 + i * 40, 33 + 23 + i * 40};
	int[] y = {8 + 383 - j * 40, 11 + 383 - j * 40, 11 + 383 - j * 40, 8 + 383 - j * 40};
	c.fillPolygon (x, y, 4);
	c.fillRect (9 + 23 + i * 40, 11 + 383 - j * 40, 22, 16);
	int[] x1 = {9 + 23 + i * 40, 8 + 23 + i * 40, 32 + 23 + i * 40, 31 + 23 + i * 40};
	int[] y1 = {27 + 383 - j * 40, 29 + 383 - j * 40, 29 + 383 - j * 40, 27 + 383 - j * 40};
	c.fillPolygon (x1, y1, 4);
	c.fillRect (6 + 23 + i * 40, 29 + 383 - j * 40, 28, 5);
	c.fillRect (3 + 23 + i * 40, 34 + 383 - j * 40, 34, 5);
	c.setColor (Color.white);
	c.fillRect (5 + 23 + i * 40, 7 + 383 - j * 40, 30, 1);
	c.fillRect (9 + 23 + i * 40, 11 + 383 - j * 40, 22, 1);
	c.fillRect (9 + 23 + i * 40, 27 + 383 - j * 40, 22, 1);
	c.fillRect (8 + 23 + i * 40, 29 + 383 - j * 40, 24, 1);
	c.fillRect (6 + 23 + i * 40, 33 + 383 - j * 40, 28, 1);
	}

	//Draw Black King
	public void drawBKing (int i, int j)
	{
	c.setColor (Color.black);
	c.fillRect (9 + 23 + i * 40, 27 + 383 - j * 40, 22, 7);
	c.fillArc (9 + 23 + i * 40, 31 + 383 - j * 40, 22, 6, 180, 180);
	int[] x = {3 + 23 + i * 40, 9 + 23 + i * 40, 31 + 23 + i * 40, 37 + 23 + i * 40};
	int[] y = {20 + 383 - j * 40, 27 + 383 - j * 40, 27 + 383 - j * 40, 20 + 383 - j * 40};
	c.fillPolygon (x, y, 4);
	c.fillRect (10 + 23 + i * 40, 16 + 383 - j * 40, 20, 4);
	c.fillArc (3 + 23 + i * 40, 12 + 383 - j * 40, 14, 16, 90, 90);
	c.fillArc (5 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 0, 90);
	c.fillArc (15 + 23 + i * 40, 8 + 383 - j * 40, 10, 16, 0, 180);
	c.fillArc (25 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 90, 90);
	c.fillArc (23 + 23 + i * 40, 12 + 383 - j * 40, 14, 16, 0, 90);
	c.fillRect (19 + 23 + i * 40, 2 + 383 - j * 40, 2, 6);
	c.fillRect (17 + 23 + i * 40, 4 + 383 - j * 40, 6, 1);
	c.setColor (Color.white);
	c.drawArc (8 + 23 + i * 40, 31 + 383 - j * 40, 22, 6, 0, 180);
	c.drawArc (8 + 23 + i * 40, 28 + 383 - j * 40, 22, 6, 0, 180);
	c.drawArc (8 + 23 + i * 40, 25 + 383 - j * 40, 22, 6, 0, 180);
	c.drawLine (4 + 23 + i * 40, 20 + 383 - j * 40, 11 + 23 + i * 40, 26 + 383 - j * 40);
	c.drawLine (29 + 23 + i * 40, 27 + 383 - j * 40, 35 + 23 + i * 40, 20 + 383 - j * 40);
	c.drawArc (4 + 23 + i * 40, 13 + 383 - j * 40, 12, 14, 90, 90);
	c.drawArc (5 + 23 + i * 40, 13 + 383 - j * 40, 8, 6, 0, 90);
	c.drawArc (26 + 23 + i * 40, 13 + 383 - j * 40, 6, 8, 90, 90);
	c.drawArc (23 + 23 + i * 40, 13 + 383 - j * 40, 12, 14, 0, 90);
	c.drawArc (14 + 23 + i * 40, 12 + 383 - j * 40, 12, 8, 180, 180);
	c.drawLine (20 + 23 + i * 40, 20 + 383 - j * 40, 20 + 23 + i * 40, 25 + 383 - j * 40);
	}

	//Draw White King

	public void drawWKing (int i, int j)
	{
	c.setColor (Color.white);
	c.fillRect (9 + 23 + i * 40, 27 + 383 - j * 40, 22, 7);
	c.fillArc (9 + 23 + i * 40, 31 + 383 - j * 40, 22, 6, 180, 180);
	int[] x = {3 + 23 + i * 40, 9 + 23 + i * 40, 31 + 23 + i * 40, 37 + 23 + i * 40};
	int[] y = {20 + 383 - j * 40, 27 + 383 - j * 40, 27 + 383 - j * 40, 20 + 383 - j * 40};
	c.fillPolygon (x, y, 4);
	c.fillRect (10 + 23 + i * 40, 16 + 383 - j * 40, 20, 4);
	c.fillArc (3 + 23 + i * 40, 12 + 383 - j * 40, 14, 16, 90, 90);
	c.fillArc (5 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 0, 90);
	c.fillArc (15 + 23 + i * 40, 8 + 383 - j * 40, 10, 16, 0, 180);
	c.fillArc (25 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 90, 90);
	c.fillArc (23 + 23 + i * 40, 12 + 383 - j * 40, 14, 16, 0, 90);
	c.setColor (Color.black);
	c.fillRect (19 + 23 + i * 40, 2 + 383 - j * 40, 2, 6);
	c.fillRect (17 + 23 + i * 40, 4 + 383 - j * 40, 6, 1);
	c.drawArc (8 + 23 + i * 40, 31 + 383 - j * 40, 22, 6, 0, 180);
	c.drawArc (8 + 23 + i * 40, 28 + 383 - j * 40, 22, 6, 0, 180);
	c.drawArc (8 + 23 + i * 40, 25 + 383 - j * 40, 22, 6, 0, 180);
	c.drawArc (2 + 23 + i * 40, 12 + 383 - j * 40, 16, 16, 90, 90);
	c.drawArc (5 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 0, 90);
	c.drawArc (15 + 23 + i * 40, 8 + 383 - j * 40, 10, 16, 0, 180);
	c.drawArc (25 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 90, 90);
	c.drawArc (23 + 23 + i * 40, 12 + 383 - j * 40, 14, 16, 0, 90);
	c.drawArc (9 + 23 + i * 40, 31 + 383 - j * 40, 22, 6, 180, 180);
	c.fillRect (9 + 23 + i * 40, 27 + 383 - j * 40, 1, 7);
	c.fillRect (31 + 23 + i * 40, 27 + 383 - j * 40, 1, 7);
	c.drawArc (15 + 23 + i * 40, 12 + 383 - j * 40, 10, 8, 180, 180);
	c.drawLine (20 + 23 + i * 40, 20 + 383 - j * 40, 20 + 23 + i * 40, 25 + 383 - j * 40);
	c.drawLine (3 + 23 + i * 40, 20 + 383 - j * 40, 9 + 23 + i * 40, 27 + 383 - j * 40);
	c.drawLine (31 + 23 + i * 40, 27 + 383 - j * 40, 37 + 23 + i * 40, 20 + 383 - j * 40);
	}

	//Draw White Queen
	public void drawWQueen (int i, int j)
	{
	c.setColor (Color.white);
	int[] x = {6 + 23 + i * 40, 11 + 23 + i * 40, 7 + 23 + i * 40};
	int[] y = {16 + 383 - j * 40, 23 + 383 - j * 40, 23 + 383 - j * 40};
	c.fillPolygon (x, y, 3);
	int[] x1 = {17 + 23 + i * 40, 19 + 23 + i * 40, 20 + 23 + i * 40, 22 + 23 + i * 40};
	int[] y1 = {22 + 383 - j * 40, 13 + 383 - j * 40, 13 + 383 - j * 40, 22 + 383 - j * 40};
	c.fillPolygon (x1, y1, 4);
	int[] x2 = {11 + 23 + i * 40, 17 + 23 + i * 40, 12 + 23 + i * 40};
	int[] y2 = {12 + 383 - j * 40, 22 + 383 - j * 40, 22 + 383 - j * 40};
	c.fillPolygon (x2, y2, 3);
	int[] x3 = {29 + 23 + i * 40, 23 + 23 + i * 40, 29 + 23 + i * 40};
	int[] y3 = {10 + 383 - j * 40, 21 + 383 - j * 40, 21 + 383 - j * 40};
	c.fillPolygon (x3, y3, 3);
	int[] x4 = {34 + 23 + i * 40, 33 + 23 + i * 40, 28 + 23 + i * 40};
	int[] y4 = {14 + 383 - j * 40, 22 + 383 - j * 40, 23 + 383 - j * 40};
	c.fillPolygon (x4, y4, 3);
	c.fillRect (6 + 23 + i * 40, 21 + 383 - j * 40, 22, 2);
	c.setColor (Color.black);
	c.drawRect (1 + 23 + i * 40, 7 + 383 - j * 40, 5, 4);
	c.drawRect (2 + 23 + i * 40, 8 + 383 - j * 40, 3, 3);
	c.drawRect (2 + 23 + i * 40, 6 + 383 - j * 40, 3, 1);
	c.drawRect (2 + 23 + i * 40, 11 + 383 - j * 40, 3, 1);
	c.fillRect (4 + 23 + i * 40, 11 + 383 - j * 40, 2, 8);
	c.fillRect (5 + 23 + i * 40, 13 + 383 - j * 40, 2, 9);
	c.drawRect (6 + 23 + i * 40, 15 + 383 - j * 40, 2, 2);
	c.fillRect (7 + 23 + i * 40, 16 + 383 - j * 40, 2, 2);
	c.fillRect (8 + 23 + i * 40, 18 + 383 - j * 40, 2, 2);
	c.fillRect (9 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.fillRect (10 + 23 + i * 40, 20 + 383 - j * 40, 2, 2);
	c.fillRect (6 + 23 + i * 40, 21 + 383 - j * 40, 1, 5);
	c.setColor (Color.white);
	c.fillRect (6 + 23 + i * 40, 23 + 383 - j * 40, 28, 1);
	c.fillRect (10 + 23 + i * 40, 22 + 383 - j * 40, 20, 1);
	c.setColor (Color.black);
	c.drawOval (9 + 23 + i * 40, 3 + 383 - j * 40, 4, 4);
	c.drawRect (10 + 23 + i * 40, 4 + 383 - j * 40, 3, 3);
	c.fillRect (11 + 23 + i * 40, 8 + 383 - j * 40, 1, 14);
	c.fillRect (12 + 23 + i * 40, 8 + 383 - j * 40, 1, 5);
	c.fillRect (12 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 12 + 383 - j * 40, 2, 1);
	c.fillRect (13 + 23 + i * 40, 13 + 383 - j * 40, 2, 2);
	c.fillRect (13 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (14 + 23 + i * 40, 16 + 383 - j * 40, 1, 3);
	c.fillRect (15 + 23 + i * 40, 16 + 383 - j * 40, 1, 5);
	c.fillRect (16 + 23 + i * 40, 19 + 383 - j * 40, 2, 3);
	c.drawRect (18 + 23 + i * 40, 2 + 383 - j * 40, 4, 5);
	c.drawRect (17 + 23 + i * 40, 3 + 383 - j * 40, 6, 3);
	c.fillRect (19 + 23 + i * 40, 7 + 383 - j * 40, 2, 6);
	c.fillRect (18 + 23 + i * 40, 10 + 383 - j * 40, 1, 10);
	c.fillRect (17 + 23 + i * 40, 16 + 383 - j * 40, 1, 6);
	c.fillRect (21 + 23 + i * 40, 10 + 383 - j * 40, 1, 10);
	c.fillRect (22 + 23 + i * 40, 16 + 383 - j * 40, 1, 6);
	c.fillRect (23 + 23 + i * 40, 19 + 383 - j * 40, 1, 3);
	c.drawRect (26 + 23 + i * 40, 4 + 383 - j * 40, 5, 4);
	c.drawRect (27 + 23 + i * 40, 3 + 383 - j * 40, 3, 6);
	c.fillRect (28 + 23 + i * 40, 9 + 383 - j * 40, 1, 13);
	c.fillRect (27 + 23 + i * 40, 9 + 383 - j * 40, 1, 4);
	c.fillRect (26 + 23 + i * 40, 11 + 383 - j * 40, 1, 4);
	c.fillRect (25 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (24 + 23 + i * 40, 16 + 383 - j * 40, 2, 3);
	c.fillRect (23 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.drawRect (35 + 23 + i * 40, 7 + 383 - j * 40, 3, 5);
	c.drawRect (34 + 23 + i * 40, 8 + 383 - j * 40, 5, 3);
	c.fillRect (34 + 23 + i * 40, 12 + 383 - j * 40, 2, 3);
	c.fillRect (33 + 23 + i * 40, 13 + 383 - j * 40, 2, 3);
	c.fillRect (34 + 23 + i * 40, 16 + 383 - j * 40, 1, 4);
	c.fillRect (33 + 23 + i * 40, 19 + 383 - j * 40, 2, 3);
	c.fillRect (32 + 23 + i * 40, 15 + 383 - j * 40, 2, 1);
	c.fillRect (32 + 23 + i * 40, 15 + 383 - j * 40, 1, 2);
	c.fillRect (31 + 23 + i * 40, 16 + 383 - j * 40, 2, 2);
	c.fillRect (30 + 23 + i * 40, 18 + 383 - j * 40, 2, 2);
	c.fillRect (29 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.fillRect (29 + 23 + i * 40, 20 + 383 - j * 40, 1, 3);
	c.fillRect (33 + 23 + i * 40, 21 + 383 - j * 40, 1, 4);
	c.fillRect (6 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (32 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (7 + 23 + i * 40, 26 + 383 - j * 40, 2, 1);
	c.fillRect (31 + 23 + i * 40, 26 + 383 - j * 40, 2, 1);
	c.setColor (Color.black);
	c.fillRect (8 + 23 + i * 40, 27 + 383 - j * 40, 24, 1);
	c.fillRect (9 + 23 + i * 40, 28 + 383 - j * 40, 22, 2);
	c.setColor (Color.black);
	c.fillRect (9 + 23 + i * 40, 29 + 383 - j * 40, 2, 1);
	c.fillRect (29 + 23 + i * 40, 29 + 383 - j * 40, 2, 1);
	c.setColor (Color.black);
	c.fillRect (9 + 23 + i * 40, 30 + 383 - j * 40, 22, 1);
	c.fillRect (9 + 23 + i * 40, 31 + 383 - j * 40, 22, 1);
	c.setColor (Color.black);
	c.fillRect (8 + 23 + i * 40, 32 + 383 - j * 40, 4, 1);
	c.fillRect (28 + 23 + i * 40, 32 + 383 - j * 40, 4, 1);
	c.fillRect (7 + 23 + i * 40, 33 + 383 - j * 40, 2, 4);
	c.fillRect (31 + 23 + i * 40, 33 + 383 - j * 40, 2, 4);
	c.fillRect (7 + 23 + i * 40, 36 + 383 - j * 40, 26, 1);
	c.fillRect (8 + 23 + i * 40, 37 + 383 - j * 40, 24, 1);

	c.setColor (Color.white);
	c.fillRect (11 + 23 + i * 40, 29 + 383 - j * 40, 18, 1);
	c.fillRect (8 + 23 + i * 40, 24 + 383 - j * 40, 24, 3);
	c.fillRect (9 + 23 + i * 40, 33 + 383 - j * 40, 22, 3);
	c.fillRect (10 + 23 + i * 40, 32 + 383 - j * 40, 20, 3);
	}

	//draw Black Queen
	public void drawBQueen (int i, int j)
	{
	c.setColor (Color.black);
	int[] x = {6 + 23 + i * 40, 11 + 23 + i * 40, 7 + 23 + i * 40};
	int[] y = {16 + 383 - j * 40, 23 + 383 - j * 40, 23 + 383 - j * 40};
	c.fillPolygon (x, y, 3);
	int[] x1 = {17 + 23 + i * 40, 19 + 23 + i * 40, 20 + 23 + i * 40, 22 + 23 + i * 40};
	int[] y1 = {22 + 383 - j * 40, 13 + 383 - j * 40, 13 + 383 - j * 40, 22 + 383 - j * 40};
	c.fillPolygon (x1, y1, 4);
	int[] x2 = {11 + 23 + i * 40, 17 + 23 + i * 40, 12 + 23 + i * 40};
	int[] y2 = {12 + 383 - j * 40, 22 + 383 - j * 40, 22 + 383 - j * 40};
	c.fillPolygon (x2, y2, 3);
	int[] x3 = {29 + 23 + i * 40, 23 + 23 + i * 40, 29 + 23 + i * 40};
	int[] y3 = {10 + 383 - j * 40, 21 + 383 - j * 40, 21 + 383 - j * 40};
	c.fillPolygon (x3, y3, 3);
	int[] x4 = {34 + 23 + i * 40, 33 + 23 + i * 40, 28 + 23 + i * 40};
	int[] y4 = {14 + 383 - j * 40, 22 + 383 - j * 40, 23 + 383 - j * 40};
	c.fillPolygon (x4, y4, 3);
	c.fillRect (6 + 23 + i * 40, 21 + 383 - j * 40, 22, 2);
	c.setColor (Color.black);
	c.drawRect (1 + 23 + i * 40, 7 + 383 - j * 40, 5, 4);
	c.drawRect (2 + 23 + i * 40, 8 + 383 - j * 40, 3, 3);
	c.drawRect (2 + 23 + i * 40, 6 + 383 - j * 40, 3, 1);
	c.drawRect (2 + 23 + i * 40, 11 + 383 - j * 40, 3, 1);
	c.fillRect (4 + 23 + i * 40, 11 + 383 - j * 40, 2, 8);
	c.fillRect (5 + 23 + i * 40, 13 + 383 - j * 40, 2, 9);
	c.drawRect (6 + 23 + i * 40, 15 + 383 - j * 40, 2, 2);
	c.fillRect (7 + 23 + i * 40, 16 + 383 - j * 40, 2, 2);
	c.fillRect (8 + 23 + i * 40, 18 + 383 - j * 40, 2, 2);
	c.fillRect (9 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.fillRect (10 + 23 + i * 40, 20 + 383 - j * 40, 2, 2);
	c.fillRect (6 + 23 + i * 40, 21 + 383 - j * 40, 1, 5);
	c.setColor (Color.black);
	c.fillRect (6 + 23 + i * 40, 23 + 383 - j * 40, 28, 1);
	c.fillRect (10 + 23 + i * 40, 22 + 383 - j * 40, 20, 1);
	c.setColor (Color.black);
	c.drawOval (9 + 23 + i * 40, 3 + 383 - j * 40, 4, 4);
	c.drawRect (10 + 23 + i * 40, 4 + 383 - j * 40, 3, 3);
	c.fillRect (11 + 23 + i * 40, 8 + 383 - j * 40, 1, 14);
	c.fillRect (12 + 23 + i * 40, 8 + 383 - j * 40, 1, 5);
	c.fillRect (12 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 12 + 383 - j * 40, 2, 1);
	c.fillRect (13 + 23 + i * 40, 13 + 383 - j * 40, 2, 2);
	c.fillRect (13 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (14 + 23 + i * 40, 16 + 383 - j * 40, 1, 3);
	c.fillRect (15 + 23 + i * 40, 16 + 383 - j * 40, 1, 5);
	c.fillRect (16 + 23 + i * 40, 19 + 383 - j * 40, 2, 3);
	c.drawRect (18 + 23 + i * 40, 2 + 383 - j * 40, 4, 5);
	c.drawRect (17 + 23 + i * 40, 3 + 383 - j * 40, 6, 3);
	c.fillRect (19 + 23 + i * 40, 7 + 383 - j * 40, 2, 6);
	c.fillRect (18 + 23 + i * 40, 10 + 383 - j * 40, 1, 10);
	c.fillRect (17 + 23 + i * 40, 16 + 383 - j * 40, 1, 6);
	c.fillRect (21 + 23 + i * 40, 10 + 383 - j * 40, 1, 10);
	c.fillRect (22 + 23 + i * 40, 16 + 383 - j * 40, 1, 6);
	c.fillRect (23 + 23 + i * 40, 19 + 383 - j * 40, 1, 3);
	c.drawRect (26 + 23 + i * 40, 4 + 383 - j * 40, 5, 4);
	c.drawRect (27 + 23 + i * 40, 3 + 383 - j * 40, 3, 6);
	c.fillRect (28 + 23 + i * 40, 9 + 383 - j * 40, 1, 13);
	c.fillRect (27 + 23 + i * 40, 9 + 383 - j * 40, 1, 4);
	c.fillRect (26 + 23 + i * 40, 11 + 383 - j * 40, 1, 4);
	c.fillRect (25 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (24 + 23 + i * 40, 16 + 383 - j * 40, 2, 3);
	c.fillRect (23 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.drawRect (35 + 23 + i * 40, 7 + 383 - j * 40, 3, 5);
	c.drawRect (34 + 23 + i * 40, 8 + 383 - j * 40, 5, 3);
	c.fillRect (34 + 23 + i * 40, 12 + 383 - j * 40, 2, 3);
	c.fillRect (33 + 23 + i * 40, 13 + 383 - j * 40, 2, 3);
	c.fillRect (34 + 23 + i * 40, 16 + 383 - j * 40, 1, 4);
	c.fillRect (33 + 23 + i * 40, 19 + 383 - j * 40, 2, 3);
	c.fillRect (32 + 23 + i * 40, 15 + 383 - j * 40, 2, 1);
	c.fillRect (32 + 23 + i * 40, 15 + 383 - j * 40, 1, 2);
	c.fillRect (31 + 23 + i * 40, 16 + 383 - j * 40, 2, 2);
	c.fillRect (30 + 23 + i * 40, 18 + 383 - j * 40, 2, 2);
	c.fillRect (29 + 23 + i * 40, 19 + 383 - j * 40, 2, 2);
	c.fillRect (29 + 23 + i * 40, 20 + 383 - j * 40, 1, 3);
	c.fillRect (33 + 23 + i * 40, 21 + 383 - j * 40, 1, 4);
	c.fillRect (6 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (32 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (7 + 23 + i * 40, 26 + 383 - j * 40, 2, 1);
	c.fillRect (31 + 23 + i * 40, 26 + 383 - j * 40, 2, 1);
	c.setColor (Color.white);
	c.fillRect (8 + 23 + i * 40, 27 + 383 - j * 40, 24, 1);
	c.fillRect (9 + 23 + i * 40, 28 + 383 - j * 40, 22, 2);
	c.setColor (Color.black);
	c.fillRect (9 + 23 + i * 40, 29 + 383 - j * 40, 2, 1);
	c.fillRect (29 + 23 + i * 40, 29 + 383 - j * 40, 2, 1);
	c.setColor (Color.white); //C
	c.fillRect (9 + 23 + i * 40, 30 + 383 - j * 40, 22, 1);
	c.fillRect (9 + 23 + i * 40, 31 + 383 - j * 40, 22, 1);
	c.setColor (Color.black);
	c.fillRect (8 + 23 + i * 40, 32 + 383 - j * 40, 4, 1);
	c.fillRect (28 + 23 + i * 40, 32 + 383 - j * 40, 4, 1);
	c.fillRect (7 + 23 + i * 40, 33 + 383 - j * 40, 2, 4);
	c.fillRect (31 + 23 + i * 40, 33 + 383 - j * 40, 2, 4);
	c.fillRect (7 + 23 + i * 40, 36 + 383 - j * 40, 26, 1);
	c.fillRect (8 + 23 + i * 40, 37 + 383 - j * 40, 24, 1);

	c.setColor (Color.black);
	c.fillRect (11 + 23 + i * 40, 29 + 383 - j * 40, 18, 1);
	c.fillRect (8 + 23 + i * 40, 24 + 383 - j * 40, 24, 3);
	c.fillRect (9 + 23 + i * 40, 33 + 383 - j * 40, 22, 3);
	c.fillRect (10 + 23 + i * 40, 32 + 383 - j * 40, 20, 3);
	}

	//Draw White Pawn
	public void drawWPawn (int i, int j)
	{
	c.setColor (Color.white);
	c.fillOval (14 + 23 + i * 40, 1 + 383 - j * 40, 11, 9);
	c.fillOval (11 + 23 + i * 40, 8 + 383 - j * 40, 17, 15);
	c.fillArc (6 + 23 + i * 40, 21 + 383 - j * 40, 27, 32, 0, 180);
	c.setColor (Color.black);
	c.drawOval (14 + 23 + i * 40, 1 + 383 - j * 40, 11, 9);
	c.drawOval (11 + 23 + i * 40, 8 + 383 - j * 40, 17, 15);
	c.drawArc (6 + 23 + i * 40, 21 + 383 - j * 40, 27, 32, 0, 180);
	c.drawLine (6 + 23 + i * 40, 37 + 383 - j * 40, 33 + 23 + i * 40, 37 + 383 - j * 40);
	c.setColor (Color.white);
	c.fillRect (16 + 23 + i * 40, 21 + 383 - j * 40, 9, 3);
	c.fillRect (16 + 23 + i * 40, 8 + 383 - j * 40, 7, 3);
	}

	//Draw Black Pawn
	public void drawBPawn (int i, int j)
	{
	c.setColor (Color.black);
	c.fillOval (14 + 23 + i * 40, 1 + 383 - j * 40, 11, 9);
	c.fillOval (11 + 23 + i * 40, 8 + 383 - j * 40, 17, 15);
	c.fillArc (6 + 23 + i * 40, 21 + 383 - j * 40, 27, 32, 0, 180);
	}

	//Draw Black Knight
	public void drawBKnight (int i, int j)
	{
	c.setColor (Color.black);
	c.fillArc (25 + i * 40, 22 + 383 - j * 40, 12, 6, 180, 90);
	c.fillArc (25 + i * 40, 6 + 383 - j * 40, 35, 42, 0, 90);
	c.fillRect (37 + i * 40, 32 + 383 - j * 40, 23, 5);
	c.fillRect (39 + i * 40, 29 + 383 - j * 40, 21, 3);
	c.fillRect (41 + i * 40, 27 + 383 - j * 40, 19, 2);
	c.fillRect (43 + i * 40, 25 + 383 - j * 40, 17, 2);
	c.fillRect (45 + i * 40, 23 + 383 - j * 40, 14, 2);
	c.fillRect (45 + i * 40, 18 + 383 - j * 40, 13, 5);
	c.fillRect (45 + i * 40, 19 + 383 - j * 40, 14, 5);
	c.fillRect (45 + i * 40, 17 + 383 - j * 40, 12, 5);
	c.fillRect (45 + i * 40, 16 + 383 - j * 40, 12, 5);
	c.fillRect (30 + i * 40, 15 + 383 - j * 40, 27, 1);
	c.fillRect (31 + i * 40, 13 + 383 - j * 40, 25, 2);
	c.fillRect (32 + i * 40, 11 + 383 - j * 40, 23, 2);
	c.fillRect (33 + i * 40, 9 + 383 - j * 40, 19, 2);
	c.fillRect (11 + 23 + i * 40, 8 + 383 - j * 40, 17, 1);
	c.fillRect (12 + 23 + i * 40, 7 + 383 - j * 40, 11, 3);
	c.fillRect (11 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (11 + 23 + i * 40, 4 + 383 - j * 40, 1, 2);
	c.fillRect (18 + 23 + i * 40, 4 + 383 - j * 40, 1, 2);
	c.fillRect (17 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (16 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (3 + 23 + i * 40, 21 + 383 - j * 40, 10, 4);
	c.fillRect (3 + 23 + i * 40, 21 + 383 - j * 40, 12, 2);
	c.fillRect (3 + 23 + i * 40, 24 + 383 - j * 40, 10, 1);
	c.fillRect (4 + 23 + i * 40, 19 + 383 - j * 40, 14, 2);
	c.fillRect (5 + 23 + i * 40, 18 + 383 - j * 40, 14, 2);
	c.fillRect (6 + 23 + i * 40, 16 + 383 - j * 40, 17, 2);
	c.fillRect (3 + 23 + i * 40, 25 + 383 - j * 40, 9, 1);
	c.fillRect (4 + 23 + i * 40, 26 + 383 - j * 40, 6, 1);
	c.fillRect (7 + 23 + i * 40, 27 + 383 - j * 40, 2, 1);
	c.drawLine (10 + 23 + i * 40, 3 + 383 - j * 40, 10 + 23 + i * 40, 8 + 383 - j * 40);
	c.drawLine (11 + 23 + i * 40, 3 + 383 - j * 40, 13 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (13 + 23 + i * 40, 6 + 383 - j * 40, 16 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 5 + 383 - j * 40, 18 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (18 + 23 + i * 40, 3 + 383 - j * 40, 19 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (19 + 23 + i * 40, 3 + 383 - j * 40, 19 + 23 + i * 40, 6 + 383 - j * 40);
	c.drawLine (10 + 23 + i * 40, 8 + 383 - j * 40, 2 + 23 + i * 40, 21 + 383 - j * 40);
	c.drawLine (2 + 23 + i * 40, 21 + 383 - j * 40, 2 + 23 + i * 40, 26 + 383 - j * 40);
	c.drawLine (8 + 23 + i * 40, 28 + 383 - j * 40, 20 + 23 + i * 40, 18 + 383 - j * 40);
	c.drawLine (20 + 23 + i * 40, 18 + 383 - j * 40, 21 + 23 + i * 40, 17 + 383 - j * 40);
	c.drawLine (21 + 23 + i * 40, 17 + 383 - j * 40, 21 + 23 + i * 40, 22 + 383 - j * 40);
	c.drawLine (21 + 23 + i * 40, 22 + 383 - j * 40, 12 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 34 + 383 - j * 40, 12 + 23 + i * 40, 37 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 37 + 383 - j * 40, 37 + 23 + i * 40, 37 + 383 - j * 40);
	c.drawLine (37 + 23 + i * 40, 37 + 383 - j * 40, 37 + 23 + i * 40, 28 + 383 - j * 40);
	c.fillArc (2 + 23 + i * 40, 22 + 383 - j * 40, 12, 6, 180, 90);
	c.fillArc (2 + 23 + i * 40, 6 + 383 - j * 40, 35, 42, 0, 90);
	c.setColor (Color.white);
	c.fillOval (12 + 23 + i * 40, 10 + 383 - j * 40, 4, 4);
	}

	//Draw White Knight
	public void drawWKnight (int i, int j)
	{
	c.setColor (Color.black);
	c.drawArc (25 + i * 40, 22 + 383 - j * 40, 12, 6, 180, 90);
	c.drawArc (25 + i * 40, 6 + 383 - j * 40, 35, 42, 0, 90);
	c.setColor (Color.white);
	c.fillRect (37 + i * 40, 32 + 383 - j * 40, 23, 5);
	c.fillRect (39 + i * 40, 29 + 383 - j * 40, 21, 3);
	c.fillRect (41 + i * 40, 27 + 383 - j * 40, 19, 2);
	c.fillRect (43 + i * 40, 25 + 383 - j * 40, 17, 2);
	c.fillRect (45 + i * 40, 23 + 383 - j * 40, 14, 2);
	c.fillRect (45 + i * 40, 18 + 383 - j * 40, 13, 5);
	c.fillRect (45 + i * 40, 19 + 383 - j * 40, 14, 5);
	c.fillRect (45 + i * 40, 17 + 383 - j * 40, 12, 5);
	c.fillRect (45 + i * 40, 16 + 383 - j * 40, 12, 5);
	c.fillRect (30 + i * 40, 15 + 383 - j * 40, 27, 1);
	c.fillRect (31 + i * 40, 13 + 383 - j * 40, 25, 2);
	c.fillRect (32 + i * 40, 11 + 383 - j * 40, 23, 2);
	c.fillRect (33 + i * 40, 9 + 383 - j * 40, 19, 2);
	c.fillRect (11 + 23 + i * 40, 8 + 383 - j * 40, 17, 1);
	c.fillRect (12 + 23 + i * 40, 7 + 383 - j * 40, 11, 3);
	c.fillRect (11 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (11 + 23 + i * 40, 4 + 383 - j * 40, 1, 2);
	c.fillRect (18 + 23 + i * 40, 4 + 383 - j * 40, 1, 2);
	c.fillRect (17 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (16 + 23 + i * 40, 6 + 383 - j * 40, 2, 2);
	c.fillRect (3 + 23 + i * 40, 21 + 383 - j * 40, 10, 4);
	c.fillRect (3 + 23 + i * 40, 21 + 383 - j * 40, 12, 2);
	c.fillRect (3 + 23 + i * 40, 24 + 383 - j * 40, 10, 1);
	c.fillRect (4 + 23 + i * 40, 19 + 383 - j * 40, 14, 2);
	c.fillRect (5 + 23 + i * 40, 18 + 383 - j * 40, 14, 2);
	c.fillRect (6 + 23 + i * 40, 16 + 383 - j * 40, 17, 2);
	c.fillRect (3 + 23 + i * 40, 25 + 383 - j * 40, 9, 1);
	c.fillRect (4 + 23 + i * 40, 26 + 383 - j * 40, 6, 1);
	c.fillRect (7 + 23 + i * 40, 27 + 383 - j * 40, 2, 1);
	c.setColor (Color.black);
	c.drawLine (10 + 23 + i * 40, 3 + 383 - j * 40, 10 + 23 + i * 40, 8 + 383 - j * 40);
	c.drawLine (11 + 23 + i * 40, 3 + 383 - j * 40, 13 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (13 + 23 + i * 40, 6 + 383 - j * 40, 16 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 5 + 383 - j * 40, 18 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (18 + 23 + i * 40, 3 + 383 - j * 40, 19 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (19 + 23 + i * 40, 3 + 383 - j * 40, 19 + 23 + i * 40, 6 + 383 - j * 40);
	c.drawLine (10 + 23 + i * 40, 8 + 383 - j * 40, 2 + 23 + i * 40, 21 + 383 - j * 40);
	c.drawLine (2 + 23 + i * 40, 21 + 383 - j * 40, 2 + 23 + i * 40, 26 + 383 - j * 40);
	c.drawLine (8 + 23 + i * 40, 28 + 383 - j * 40, 20 + 23 + i * 40, 18 + 383 - j * 40);
	c.drawLine (20 + 23 + i * 40, 18 + 383 - j * 40, 21 + 23 + i * 40, 17 + 383 - j * 40);
	c.drawLine (21 + 23 + i * 40, 17 + 383 - j * 40, 21 + 23 + i * 40, 22 + 383 - j * 40);
	c.drawLine (21 + 23 + i * 40, 22 + 383 - j * 40, 12 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 34 + 383 - j * 40, 12 + 23 + i * 40, 37 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 37 + 383 - j * 40, 37 + 23 + i * 40, 37 + 383 - j * 40);
	c.drawLine (37 + 23 + i * 40, 37 + 383 - j * 40, 37 + 23 + i * 40, 28 + 383 - j * 40);
	c.drawArc (2 + 23 + i * 40, 22 + 383 - j * 40, 12, 6, 180, 90);
	c.drawArc (2 + 23 + i * 40, 6 + 383 - j * 40, 35, 42, 0, 90);
	c.setColor (Color.black);
	c.fillOval (12 + 23 + i * 40, 10 + 383 - j * 40, 4, 4);
	}

	//Draw Black Bishop
	public void drawBBishop (int i, int j)
	{
	c.setColor (Color.black);
	c.fillRect (19 + 23 + i * 40, 4 + 383 - j * 40, 2, 2);
	c.drawLine (19 + 23 + i * 40, 3 + 383 - j * 40, 20 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (18 + 23 + i * 40, 4 + 383 - j * 40, 18 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (20 + 23 + i * 40, 4 + 383 - j * 40, 20 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (19 + 23 + i * 40, 6 + 383 - j * 40, 20 + 23 + i * 40, 6 + 383 - j * 40);
	int[] x = {18 + 23 + i * 40, 21 + 23 + i * 40, 28 + 23 + i * 40, 28 + 23 + i * 40, 24 + 23 + i * 40, 15 + 23 + i * 40, 12 + 23 + i * 40, 12 + 23 + i * 40, 18 + 23 + i * 40};
	int[] y = {9 + 383 - j * 40, 9 + 383 - j * 40, 15 + 383 - j * 40, 20 + 383 - j * 40, 23 + 383 - j * 40, 23 + 383 - j * 40, 20 + 383 - j * 40, 15 + 383 - j * 40, 9 + 383 - j * 40};
	c.fillPolygon (x, y, 9);
	c.drawLine (15 + 23 + i * 40, 25 + 383 - j * 40, 24 + 23 + i * 40, 25 + 383 - j * 40);
	c.drawLine (14 + 23 + i * 40, 26 + 383 - j * 40, 25 + 23 + i * 40, 26 + 383 - j * 40);
	c.drawLine (13 + 23 + i * 40, 29 + 383 - j * 40, 26 + 23 + i * 40, 29 + 383 - j * 40);
	c.drawLine (14 + 23 + i * 40, 30 + 383 - j * 40, 25 + 23 + i * 40, 30 + 383 - j * 40);
	c.drawLine (17 + 23 + i * 40, 31 + 383 - j * 40, 22 + 23 + i * 40, 31 + 383 - j * 40);
	c.drawLine (17 + 23 + i * 40, 34 + 383 - j * 40, 22 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 35 + 383 - j * 40, 33 + 23 + i * 40, 35 + 383 - j * 40);
	c.drawLine (6 + 23 + i * 40, 35 + 383 - j * 40, 6 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 36 + 383 - j * 40, 6 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (33 + 23 + i * 40, 35 + 383 - j * 40, 33 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (33 + 23 + i * 40, 36 + 383 - j * 40, 34 + 23 + i * 40, 36 + 383 - j * 40);
	c.fillRect (34 + 23 + i * 40, 35 + 383 - j * 40, 1, 1);

	c.setColor (Color.black);
	c.drawLine (18 + 23 + i * 40, 2 + 383 - j * 40, 21 + 23 + i * 40, 2 + 383 - j * 40);
	c.fillRect (17 + 23 + i * 40, 3 + 383 - j * 40, 2, 4);
	c.fillRect (21 + 23 + i * 40, 3 + 383 - j * 40, 2, 4);
	c.drawLine (18 + 23 + i * 40, 7 + 383 - j * 40, 21 + 23 + i * 40, 7 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 8 + 383 - j * 40, 22 + 23 + i * 40, 8 + 383 - j * 40);
	c.fillRect (17 + 23 + i * 40, 8 + 383 - j * 40, 2, 2);
	c.fillRect (15 + 23 + i * 40, 9 + 383 - j * 40, 2, 2);
	c.fillRect (14 + 23 + i * 40, 10 + 383 - j * 40, 2, 2);
	c.fillRect (13 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 12 + 383 - j * 40, 2, 2);
	c.fillRect (11 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (21 + 23 + i * 40, 8 + 383 - j * 40, 2, 2);
	c.fillRect (23 + 23 + i * 40, 9 + 383 - j * 40, 2, 2);
	c.fillRect (24 + 23 + i * 40, 10 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 12 + 383 - j * 40, 2, 2);
	c.fillRect (27 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.drawLine (11 + 23 + i * 40, 14 + 383 - j * 40, 11 + 23 + i * 40, 21 + 383 - j * 40);
	c.drawLine (28 + 23 + i * 40, 14 + 383 - j * 40, 28 + 23 + i * 40, 21 + 383 - j * 40);
	c.fillRect (11 + 23 + i * 40, 20 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 22 + 383 - j * 40, 2, 2);
	c.fillRect (27 + 23 + i * 40, 21 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 22 + 383 - j * 40, 2, 2);
	c.setColor (Color.white);
	c.drawLine (13 + 23 + i * 40, 23 + 383 - j * 40, 26 + 23 + i * 40, 23 + 383 - j * 40);
	c.setColor (Color.black);
	c.drawLine (14 + 23 + i * 40, 24 + 383 - j * 40, 25 + 23 + i * 40, 24 + 383 - j * 40);
	c.fillRect (13 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 26 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 26 + 383 - j * 40, 2, 2);
	c.setColor (Color.white);
	c.drawLine (12 + 23 + i * 40, 27 + 383 - j * 40, 27 + 23 + i * 40, 27 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 28 + 383 - j * 40, 27 + 23 + i * 40, 28 + 383 - j * 40);
	c.setColor (Color.black);
	c.drawLine (12 + 23 + i * 40, 29 + 383 - j * 40, 12 + 23 + i * 40, 30 + 383 - j * 40);
	c.drawLine (27 + 23 + i * 40, 29 + 383 - j * 40, 27 + 23 + i * 40, 30 + 383 - j * 40);
	c.fillRect (13 + 23 + i * 40, 30 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 30 + 383 - j * 40, 2, 2);
	c.drawLine (13 + 23 + i * 40, 31 + 383 - j * 40, 26 + 23 + i * 40, 31 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 32 + 383 - j * 40, 23 + 23 + i * 40, 32 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 33 + 383 - j * 40, 23 + 23 + i * 40, 33 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 34 + 383 - j * 40, 17 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (22 + 23 + i * 40, 34 + 383 - j * 40, 34 + 23 + i * 40, 34 + 383 - j * 40);
	c.fillRect (3 + 23 + i * 40, 35 + 383 - j * 40, 2, 2);
	c.fillRect (3 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (5 + 23 + i * 40, 37 + 383 - j * 40, 6 + 23 + i * 40, 37 + 383 - j * 40);
	c.fillRect (6 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.fillRect (35 + 23 + i * 40, 35 + 383 - j * 40, 2, 2);
	c.fillRect (35 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (34 + 23 + i * 40, 37 + 383 - j * 40, 35 + 23 + i * 40, 37 + 383 - j * 40);
	c.fillRect (32 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (6 + 23 + i * 40, 36 + 383 - j * 40, 33 + 23 + i * 40, 36 + 383 - j * 40);
	c.setColor (Color.white);
	c.fillRect (19 + 23 + i * 40, 12 + 383 - j * 40, 2, 7);
	c.fillRect (17 + 23 + i * 40, 14 + 383 - j * 40, 6, 3);
	c.drawLine (16 + 23 + i * 40, 15 + 383 - j * 40, 23 + 23 + i * 40, 15 + 383 - j * 40);
	}

	//Draw White Bishop

	public void drawWBishop (int i, int j)
	{
	c.setColor (Color.white);
	c.fillRect (19 + 23 + i * 40, 4 + 383 - j * 40, 2, 2);
	c.drawLine (19 + 23 + i * 40, 3 + 383 - j * 40, 20 + 23 + i * 40, 3 + 383 - j * 40);
	c.drawLine (18 + 23 + i * 40, 4 + 383 - j * 40, 18 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (20 + 23 + i * 40, 4 + 383 - j * 40, 20 + 23 + i * 40, 5 + 383 - j * 40);
	c.drawLine (19 + 23 + i * 40, 6 + 383 - j * 40, 20 + 23 + i * 40, 6 + 383 - j * 40);
	int[] x = {18 + 23 + i * 40, 21 + 23 + i * 40, 28 + 23 + i * 40, 28 + 23 + i * 40, 24 + 23 + i * 40, 15 + 23 + i * 40, 12 + 23 + i * 40, 12 + 23 + i * 40, 18 + 23 + i * 40};
	int[] y = {9 + 383 - j * 40, 9 + 383 - j * 40, 15 + 383 - j * 40, 20 + 383 - j * 40, 23 + 383 - j * 40, 23 + 383 - j * 40, 20 + 383 - j * 40, 15 + 383 - j * 40, 9 + 383 - j * 40};
	c.fillPolygon (x, y, 9);
	c.drawLine (15 + 23 + i * 40, 25 + 383 - j * 40, 24 + 23 + i * 40, 25 + 383 - j * 40);
	c.drawLine (14 + 23 + i * 40, 26 + 383 - j * 40, 25 + 23 + i * 40, 26 + 383 - j * 40);
	c.drawLine (13 + 23 + i * 40, 29 + 383 - j * 40, 26 + 23 + i * 40, 29 + 383 - j * 40);
	c.drawLine (14 + 23 + i * 40, 30 + 383 - j * 40, 25 + 23 + i * 40, 30 + 383 - j * 40);
	c.drawLine (17 + 23 + i * 40, 31 + 383 - j * 40, 22 + 23 + i * 40, 31 + 383 - j * 40);
	c.drawLine (17 + 23 + i * 40, 34 + 383 - j * 40, 22 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 35 + 383 - j * 40, 33 + 23 + i * 40, 35 + 383 - j * 40);
	c.drawLine (6 + 23 + i * 40, 35 + 383 - j * 40, 6 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 36 + 383 - j * 40, 6 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (33 + 23 + i * 40, 35 + 383 - j * 40, 33 + 23 + i * 40, 36 + 383 - j * 40);
	c.drawLine (33 + 23 + i * 40, 36 + 383 - j * 40, 34 + 23 + i * 40, 36 + 383 - j * 40);
	c.fillRect (34 + 23 + i * 40, 35 + 383 - j * 40, 1, 1);
	c.setColor (Color.black);
	c.drawLine (18 + 23 + i * 40, 2 + 383 - j * 40, 21 + 23 + i * 40, 2 + 383 - j * 40);
	c.fillRect (17 + 23 + i * 40, 3 + 383 - j * 40, 2, 4);
	c.fillRect (21 + 23 + i * 40, 3 + 383 - j * 40, 2, 4);
	c.drawLine (18 + 23 + i * 40, 7 + 383 - j * 40, 21 + 23 + i * 40, 7 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 8 + 383 - j * 40, 22 + 23 + i * 40, 8 + 383 - j * 40);
	c.fillRect (17 + 23 + i * 40, 8 + 383 - j * 40, 2, 2);
	c.fillRect (15 + 23 + i * 40, 9 + 383 - j * 40, 2, 2);
	c.fillRect (14 + 23 + i * 40, 10 + 383 - j * 40, 2, 2);
	c.fillRect (13 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 12 + 383 - j * 40, 2, 2);
	c.fillRect (11 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.fillRect (21 + 23 + i * 40, 8 + 383 - j * 40, 2, 2);
	c.fillRect (23 + 23 + i * 40, 9 + 383 - j * 40, 2, 2);
	c.fillRect (24 + 23 + i * 40, 10 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 11 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 12 + 383 - j * 40, 2, 2);
	c.fillRect (27 + 23 + i * 40, 14 + 383 - j * 40, 2, 2);
	c.drawLine (11 + 23 + i * 40, 14 + 383 - j * 40, 11 + 23 + i * 40, 21 + 383 - j * 40);
	c.drawLine (28 + 23 + i * 40, 14 + 383 - j * 40, 28 + 23 + i * 40, 21 + 383 - j * 40);
	c.fillRect (11 + 23 + i * 40, 20 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 22 + 383 - j * 40, 2, 2);
	c.fillRect (27 + 23 + i * 40, 21 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 22 + 383 - j * 40, 2, 2);
	c.setColor (Color.black);
	c.drawLine (13 + 23 + i * 40, 23 + 383 - j * 40, 26 + 23 + i * 40, 23 + 383 - j * 40);
	c.setColor (Color.black);
	c.drawLine (14 + 23 + i * 40, 24 + 383 - j * 40, 25 + 23 + i * 40, 24 + 383 - j * 40);
	c.fillRect (13 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (12 + 23 + i * 40, 26 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 24 + 383 - j * 40, 2, 2);
	c.fillRect (26 + 23 + i * 40, 26 + 383 - j * 40, 2, 2);
	c.setColor (Color.black);
	c.drawLine (12 + 23 + i * 40, 27 + 383 - j * 40, 27 + 23 + i * 40, 27 + 383 - j * 40);
	c.drawLine (12 + 23 + i * 40, 28 + 383 - j * 40, 27 + 23 + i * 40, 28 + 383 - j * 40);
	c.setColor (Color.black);
	c.drawLine (12 + 23 + i * 40, 29 + 383 - j * 40, 12 + 23 + i * 40, 30 + 383 - j * 40);
	c.drawLine (27 + 23 + i * 40, 29 + 383 - j * 40, 27 + 23 + i * 40, 30 + 383 - j * 40);
	c.fillRect (13 + 23 + i * 40, 30 + 383 - j * 40, 2, 2);
	c.fillRect (25 + 23 + i * 40, 30 + 383 - j * 40, 2, 2);
	c.drawLine (13 + 23 + i * 40, 31 + 383 - j * 40, 26 + 23 + i * 40, 31 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 32 + 383 - j * 40, 23 + 23 + i * 40, 32 + 383 - j * 40);
	c.drawLine (16 + 23 + i * 40, 33 + 383 - j * 40, 23 + 23 + i * 40, 33 + 383 - j * 40);
	c.drawLine (5 + 23 + i * 40, 34 + 383 - j * 40, 17 + 23 + i * 40, 34 + 383 - j * 40);
	c.drawLine (22 + 23 + i * 40, 34 + 383 - j * 40, 34 + 23 + i * 40, 34 + 383 - j * 40);
	c.fillRect (3 + 23 + i * 40, 35 + 383 - j * 40, 2, 2);
	c.fillRect (3 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (5 + 23 + i * 40, 37 + 383 - j * 40, 6 + 23 + i * 40, 37 + 383 - j * 40);
	c.fillRect (6 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.fillRect (35 + 23 + i * 40, 35 + 383 - j * 40, 2, 2);
	c.fillRect (35 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (34 + 23 + i * 40, 37 + 383 - j * 40, 35 + 23 + i * 40, 37 + 383 - j * 40);
	c.fillRect (32 + 23 + i * 40, 36 + 383 - j * 40, 2, 2);
	c.drawLine (6 + 23 + i * 40, 36 + 383 - j * 40, 33 + 23 + i * 40, 36 + 383 - j * 40);
	c.setColor (Color.black);
	c.fillRect (19 + 23 + i * 40, 12 + 383 - j * 40, 2, 7);
	c.fillRect (17 + 23 + i * 40, 14 + 383 - j * 40, 6, 3);
	c.drawLine (16 + 23 + i * 40, 15 + 383 - j * 40, 23 + 23 + i * 40, 15 + 383 - j * 40);
	}
}



