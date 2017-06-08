package com.flappybirdmap.tool;

import javax.swing.*;
import java.awt.*;

public class ScalePanel extends JPanel
{
    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = 2;

    public int direction = HORIZONTAL;
    int zero;

    public ScalePanel(int direction, int zero)
    {
        this.direction = direction;
        this.zero = zero;
    }

    @Override protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        switch (direction)
        {
            case HORIZONTAL:
                paintHorizontalScale(g2d);
                break;
            case VERTICAL:
                paintVerticalScale(g2d);
                break;
        }
    }

    private void paintHorizontalScale(Graphics2D g)
    {
    }

    private void paintVerticalScale(Graphics2D g)
    {

    }
}
