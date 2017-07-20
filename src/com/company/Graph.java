package com.company;

import java.util.ArrayList;

/**
 * Created by laileon on 2017/7/20.
 */
public class Graph {
    //邻接矩阵
    int[][]g = new int[1][2];
    //邻接表
    class DirectGraphNode {
        int label;
        ArrayList<DirectGraphNode> neighbors;

        public DirectGraphNode(int label) {
            this.label = label;
            neighbors = new ArrayList<DirectGraphNode>();
        }
    }

    //无向图
    class UndirectGraphNode {
        int label;
        ArrayList<UndirectGraphNode> neighbors;

        public UndirectGraphNode(int label) {
            this.label = label;
            neighbors = new ArrayList<UndirectGraphNode>();
        }
    }
}
