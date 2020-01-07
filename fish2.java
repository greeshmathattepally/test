//17211A12A8

import java.awt.*;
import java.applet.*;
import java.awt.event.*;




public class fish2 extends Applet implements ActionListener
{
 

int i=0,j=0,a=40,b=88,A=20,B=20,C=40,D=50,E=80,F=70,G=50,H=80,I=70,p=80,q=100,r=90,s=60,t=60,u=75,v=120,w=120,x=105;
int x1[]={20,20,40};
int y1[]={80,100,90};
int n1=3;
int x2[]={50,80,70};
int y2[]={60,60,75};
int n2=3;
int x3[]={50,80,70};
int y3[]={120,120,105};
int n3=3;
public void init()
{

setBackground(Color.cyan);

Button b1=new Button("LEFT");
add(b1);
b1.addActionListener(this);

Button b2=new Button("RIGHT");
add(b2);
b2.addActionListener(this);

Button b3=new Button("UP");
add(b3);
b3.addActionListener(this);

Button b4=new Button("DOWN");
add(b4);
b4.addActionListener(this);



b1.setBounds(650,80,50,20);
b2.setBounds(750,80,50,20);
b3.setBounds(700,30,50,20);
b4.setBounds(700,130,50,20);


setLayout(null);
}

Button b1,b2;

void slep()
{
try{Thread.sleep(150);}catch(Exception ex){}
}

  public void paint(Graphics g)
   {
     int x1[]={A+i,B+i,C+i};
int x2[]={D+i,E+i,F+i};
int x3[]={G+i,H+i,I+i};
int y1[]={p+j,q+j,r+j};
int y2[]={s+j,t+j,u+j};
int y3[]={v+j,w+j,x+j};
setForeground(Color.orange);
g.fillOval(a+i,75+j,60,30);
     g.fillPolygon(x1,y1,n1);
    g.fillPolygon(x2,y2,n2);
    g.fillPolygon(x3,y3,n3);
g.setColor(Color.black);
     g.drawOval(a+i,75+j,60,30);
     g.drawPolygon(x1,y1,n1);
    g.drawPolygon(x2,y2,n2);
    g.drawPolygon(x3,y3,n3);

     g.fillOval(b+i,88+j,4,4);

     slep();
 
if(i%2==0)
{
g.drawOval(103+i,80+j,8,8);
g.setColor(Color.white);
g.fillOval(103+i,80+j,8,8);

    slep();
}
i=i+9;
if(i%3==0)
{
g.setColor(Color.black);
g.drawOval(105+i,72+j,15,15);
g.setColor(Color.white);
g.fillOval(105+i,72+j,15,15);
slep();
}
if(i%5==0)
{
g.setColor(Color.black);
g.drawOval(120+i,66+j,19,19);
g.setColor(Color.white);
g.fillOval(120+i,66+j,19,19);
slep();
}
repaint();
}


public void actionPerformed(ActionEvent e)
{
  String s=e.getActionCommand();
if(s.equals("LEFT"))
 i=i-20;
else if(s.equals("RIGHT"))
 i=i+20;
else if(s.equals("UP"))
 j=j-20;
else if(s.equals("DOWN"))
 j=j+20;


repaint();
}
   


}