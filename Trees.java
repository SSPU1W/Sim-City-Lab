import java.awt.Graphics;
import java.awt.Color;
 
public class Trees
{
    int x;
    int y;
    int row;
    int col;
     
    Color green;
    Color black;
     
    public Trees(int x, int y, int row, int col)
    {
        this.x = x;
        this.y = y;
        this.row = row;
        this.col = col;
         
        green = new Color(0,255,0);
        black = new Color(0,0,0);
         
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
                g.setColor(green);
                g.fillOval(tempX,tempY,30,20);
                 
                //window
                g.setColor(black);
                g.drawOval(tempX+2,tempY+4,12,10);
                 
                tempX += 35;
            }
            tempY += 25;
        }
    }
     
     
}
