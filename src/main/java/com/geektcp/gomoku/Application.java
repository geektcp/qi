package com.geektcp.gomoku;


import com.geektcp.gomoku.panel.Ai;
import com.geektcp.gomoku.panel.DrawingPanel;
import com.geektcp.gomoku.panel.GomokuMouseEvent;


/**
 * Created by TangHaiyang on 2019/9/20.
 */
public class Application {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(700, 700);
        GomokuMouseEvent myMouseEvent = new GomokuMouseEvent();
        panel.addMouseListener(myMouseEvent);
        Ai.init(panel);
        Ai.initChessBoard();
    }
}
