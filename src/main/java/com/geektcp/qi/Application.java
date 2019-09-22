package com.geektcp.qi;


import com.geektcp.qi.panel.Ai;
import com.geektcp.qi.panel.DrawingPanel;
import com.geektcp.qi.panel.QiMouseEvent;


/**
 * Created by TangHaiyang on 2019/9/20.
 */
public class Application {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(700, 700);
        QiMouseEvent qiMouseEvent = new QiMouseEvent();
        panel.addMouseListener(qiMouseEvent);
        Ai.init(panel);
        Ai.initChessBoard();
    }
}
