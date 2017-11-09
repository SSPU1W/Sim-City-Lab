import java.awt.Graphics;
import java.awt.Color;
 
public class House2
{
    int x;
    int y;
    int row;
    int col;
     
    Color blue;
    Color white;
     
    public House2(int x, int y, int row, int col)
    {
        this.x = x;
        this.y = y;
        this.row = row;
        this.col = col;
         
        blue = new Color(0,0,220);
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
                g.setColor(blue);
                g.fillRect(tempX,tempY,30,20);
                 
                //window
                g.setColor(white);
                g.fillRect(tempX+2,tempY+4,12,10);
                 
                tempX += 35;
            }
            tempY += 25;
        }
    }
     
     
}
