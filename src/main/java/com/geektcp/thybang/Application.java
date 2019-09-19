package com.geektcp.thybang;


import com.geektcp.thybang.panel.Ai;
import com.geektcp.thybang.panel.DrawingPanel;
import com.geektcp.thybang.panel.ThyMouseEvent;


/**
 * Created by TangHaiyang on 2019/9/20.
 */
public class Application {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(700, 700);
        ThyMouseEvent myMouseEvent = new ThyMouseEvent();
        panel.addMouseListener(myMouseEvent);
        Ai.init(panel);
        Ai.initChessBoard();
    }
}
