package com.geektcp.gomoku;


import com.geektcp.gomoku.panel.Ai;
import com.geektcp.gomoku.panel.DrawingPanel;
import com.geektcp.gomoku.panel.ThyMouseEvent;


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
