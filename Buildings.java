import java.awt.Graphics;
import java.awt.Color;
 
public class Buildings
{
    int x;
    int y;
    int row;
    int col;
     
    Color black;
    Color white;
     
    public Buildings(int x, int y, int row, int col)
    {
        this.x = x;
        this.y = y;
        this.row = row;
        this.col = col;
         
        black = new Color(0,0,0);
        white = new Color(255,255,255);
         
    }
     
    public void drawMe(Graphics g)
    {
        int tempX = x;
        int tempY = y;
         
        for(int r=0; r<row; r++)
        {
            tempX = x;
            for(int c=0; c<col; c++)
            {
                //house
                g.setColor(black);
                g.fillRect(tempX,tempY,40,50);
                 
                //window
                g.setColor(white);
                g.fillRect(tempX+3,tempY+4,12,10);
				g.fillRect(tempX+3,tempY+30,12,10);
			    g.fillRect(tempX+20,tempY+4,12,10);
				g.fillRect(tempX+20,tempY+30,12,10);
				
                 
                tempX += 75;
            }
            tempY += 60;
        }
    }
     
     
}
