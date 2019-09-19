package com.geektcp.gomoku.panel;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by TangHaiyang on 2019/9/20.
 */ // 树节点
class Node{
    public Node bestChild=null;
    public ArrayList<Node> child=new ArrayList<Node>();
    public Point p=new Point();
    public int mark;
    Node(){
        this.child.clear();
        bestChild=null;
        mark=0;
    }
    public void setPoint(Point r){
        p.x=r.x;
        p.y=r.y;
    }
    public void addChild(Node r){
        this.child.add(r);
    }
    public Node getLastChild(){
        return child.get(child.size()-1);
    }
}
