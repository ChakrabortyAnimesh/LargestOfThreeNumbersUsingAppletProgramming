package com.company.java;

import java.applet.Applet;
import java.awt.*;
/* <applet code="Main" height="500" width="500"></applet>*/
public class Main extends Applet{
    TextField t1,t2,t3;

    @Override
    public void init() {
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        add(t1);
        add(t2);
        add(t3);
        t1.setText("0");
        t2.setText("0");
        t3.setText("0");
    }

    @Override
    public void paint(Graphics g) {
        int a,b,c,result;
        String str;
        g.drawString("Enter value to check the maximum of 3 numbers: ",10,50);
        str=t1.getText();
        a = Integer.parseInt(str);
        str=t2.getText();
        b= Integer.parseInt(str);
        str=t3.getText();
        c = Integer.parseInt(str);
        g.setColor(Color.blue);
        if(a>b&&a>c)
            result=a;
        else if(b>a&&b>c)
            result=b;
        else
            result=c;

        g.drawString("Maximum of three 3 numbers is "+result,10,70);
        showStatus("Maximum of 3 numbers");
    }
    public boolean action(Event e,Object o)
    {
        repaint();
        return  true;
    }
}
