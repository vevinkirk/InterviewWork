package treesandgraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * Problem: Given a directed graph, design an algorithm to find out whether
 * there is a route between two nodes.
 *
 */
class RouteBetweenNodes{
    enum State{Unvisited,Visited,Visiting;}

    boolean search(Graph g, Node start, Node end){
        if(start == end)return true;

        //operates as Queue
        LinkedList<Node> q = new LinkedList<Node>();

        for (Node u : g.getNodes()){
            u.state = State.Unvisted;
        }
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while(!q.isEmpty()){
            u = q.removeFirst(); //i.e., dequeue()
            if(u != null){
                for(Node v : u.getAdjacent()){
                    if(v.state == State.Unvisited){
                        if(v == end){
                            return true;
                        }else{
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}
