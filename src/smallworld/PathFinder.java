package smallworld;

import edu.princeton.cs.In;
import edu.princeton.cs.StdIn;
import edu.princeton.cs.StdOut;
import java.util.Stack;

/******************************************************************************
 *  Compilation:  javac PathFinder.java
 *  Execution:    java Pathfinder input.txt delimiter source
 *  Dependencies: Queue.java Stack.java Graph.java
 *  
 *  Runs breadth first search algorithm from source s on a graph G.
 *  After preprocessing the graph, can process shortest path queries
 *  from s to any vertex t.
 *
 *  % java PathFinder routes.txt " " JFK
 *  LAX
 *     JFK
 *     ORD
 *     PHX
 *     LAX
 *  distance 3
 *  MCO
 *     JFK
 *     MCO
 *  distance 1
 *  DFW
 *     JFK
 *     ORD
 *     DFW
 *  distance 2
 *
 ******************************************************************************/

public class PathFinder {

    // prev[v] = previous vertex on shortest path from s to v
    // dist[v] = length of shortest path from s to v
    private ST<String, String>  prev = new ST<String, String>();
    private ST<String, Integer> dist = new ST<String, Integer>();

    // run BFS in graph G from given source vertex s
    public PathFinder(Graph G, String s) {

        // put source on the queue
        Queue<String> q = new Queue<String>();
        q.enqueue(s);
        dist.put(s, 0);
        
        // repeated remove next vertex v from queue and insert
        // all its neighbors, provided they haven't yet been visited
        while (!q.isEmpty()) {
            String v = q.dequeue();
            for (String w : G.adjacentTo(v)) {
                if (!dist.contains(w)) {
                    q.enqueue(w);
                    dist.put(w, 1 + dist.get(v));
                    prev.put(w, v);
                }
            }
        }
    }

    // is v reachable from the source s?
    public boolean hasPathTo(String v) {
        return dist.contains(v);
    }

    // return the length of the shortest path from v to s
    public int distanceTo(String v) {
        
        if (!hasPathTo(v)) return Integer.MAX_VALUE;
        return dist.get(v);
        
            
         
                
    }

    // return the shortest path from v to s as an Iterable
    public Iterable<String> pathTo(String v) {
        Stack<String> path = new Stack<String>();
        while (v != null && dist.contains(v)) {
        
            path.push(v);
            v = prev.get(v);
    }
        return path;
    }


    public static void main(String[] args) {
        String filename  = args[0];
        String delimiter = args[1];
        
        System.out.println( filename );
        System.out.println( ">" + delimiter + "<" );
        In in = new In(filename); 
        Graph G = GraphGenerator.read(in, delimiter);
        String s = args[2];
        PathFinder pf = new PathFinder(G, s);
        
        
        pf.report( "A1" );
        pf.report( "A2" );
        pf.report( "A3" );
        pf.report( "A4" );
        pf.report( "A5" );
        pf.report( "A6" );
        pf.report( "A7" );
        pf.report( "A8" );
        pf.report( "A9" );
        pf.report( "A10" );
        pf.report( "A11" );
        pf.report( "A12" );
        pf.report( "A13" );
        pf.report( "A14" );
        pf.report( "A15" );
        pf.report( "A16" );
        pf.report( "A17" );
        pf.report( "A18" );
        pf.report( "A19" );
        pf.report( "A20" );
        pf.report( "I1" );
        pf.report( "I2" );
        pf.report( "I3" );
        pf.report( "I4" );
        pf.report( "I5" );
        pf.report( "I6" );
        pf.report( "I7" );
        pf.report( "I8" );
        pf.report( "I9" );
        pf.report( "I10" );
        pf.report( "I11" );
        pf.report( "I12" );
        pf.report( "I13" );
        pf.report( "I14" );
        pf.report( "I15" );
        pf.report( "I16" );
        pf.report( "I17" );
        pf.report( "I18" );
        pf.report( "I19" );
        pf.report( "I20" );
        pf.report( "I21" );
        pf.report( "I22" );
        pf.report( "I23" );
        pf.report( "I24" );
        pf.report( "I25" );
        pf.report( "I26" );
        pf.report( "I27" );
        pf.report( "S1" );
        pf.report( "S2" );
        pf.report( "S3" );
        pf.report( "S4" );
        pf.report( "S5" );
        pf.report( "S6" );
        pf.report( "S7" );
        pf.report( "S8" );
        pf.report( "S9" );
        pf.report( "S10" );
        pf.report( "S11" );
        pf.report( "S12" );
        pf.report( "S13" );
        pf.report( "S14" );
        pf.report( "S15" );
        pf.report( "S16" );
        pf.report( "S17" );
        pf.report( "S18" );
        pf.report( "S19" );
        pf.report( "S21" );
        pf.report( "E1" );
        pf.report( "E2" );
        pf.report( "E3" );
        pf.report( "E4" );
        pf.report( "E5" );
        pf.report( "E6" );
        pf.report( "E7" );
        pf.report( "E8" );
        pf.report( "E9" );
        pf.report( "E10" );
        pf.report( "E11" );
        pf.report( "E12" );
        pf.report( "E13" );
        pf.report( "E14" );
        pf.report( "E15" );
        pf.report( "E16" );
        pf.report( "E17" );
        pf.report( "E18" );
        pf.report( "E19" );
        pf.report( "E20" );
        pf.report( "E21" );
        pf.report( "E22" );
        pf.report( "E23" );
        pf.report( "E24" );
        pf.report( "E25" );
        pf.report( "E26" );
        pf.report( "E27" );
        pf.report( "E28" );
        pf.report( "E29" );
        pf.report( "E30" );
        pf.report( "E31" );
        pf.report( "E32" );
        pf.report( "E33" );
        pf.report( "E34" );
        pf.report( "E35" );
        pf.report( "E36" );
        pf.report( "E37" );
        pf.report( "E38" );
        pf.report( "G1" );
        pf.report( "G2" );
        pf.report( "G3" );
        pf.report( "G4" );
        pf.report( "G5" );
        pf.report( "G6" );
        pf.report( "G7" );
        pf.report( "G8" );
        pf.report( "G9" );
        pf.report( "G10" );
        pf.report( "G11" );
        pf.report( "G12" );
        pf.report( "G13" );
        pf.report( "G14" );
        pf.report( "G15" );
        pf.report( "G16" );
        pf.report( "G17" );
        pf.report( "G18" );
        pf.report( "G19" );
        pf.report( "M1" );
        pf.report( "M2" );
        pf.report( "M3" );
        pf.report( "M4" );
        pf.report( "M5" );
        pf.report( "M6" );
        pf.report( "M7" );
        pf.report( "M8" );
        pf.report( "M9" );
        pf.report( "M10" );
        pf.report( "M11" );
        pf.report( "M12" );
        pf.report( "M13" );
        pf.report( "M14" );
        pf.report( "M15" );
        pf.report( "M16" );
        pf.report( "M17" );
        pf.report( "M18" );
        pf.report( "M19" );
        pf.report( "M20" );
        pf.report( "M21" );
        pf.report( "M22" );
        pf.report( "M23" );
        pf.report( "M24" );
        pf.report( "M25" );
        pf.report( "m3" );
        pf.report( "m4" );
        pf.report( "m5" );
        pf.report( "H1" );
        pf.report( "H2" );
        pf.report( "H3" );
        pf.report( "H4" );
        pf.report( "H5" );
        pf.report( "H6" );
        pf.report( "H7" );
        pf.report( "H8" );
        pf.report( "H9" );
        pf.report( "H10" );
        pf.report( "H11" );
        pf.report( "H12" );
        pf.report( "H13" );
        pf.report( "H14" );
        pf.report( "H15" );
        pf.report( "H16" );
        pf.report( "H17" );
        pf.report( "H18" );
        pf.report( "H19" );
        pf.report( "H20" );
        pf.report( "H21" );
        pf.report( "T1" );
        pf.report( "T2" );
        pf.report( "T3" );
        pf.report( "T4" );
        pf.report( "T5" );
        pf.report( "T6" );
        pf.report( "T7" );
        pf.report( "T8" );
        pf.report( "T9" );
        pf.report( "T10" );
        pf.report( "T11" );
        pf.report( "T12" );
        pf.report( "T13" );
        pf.report( "T14" );
        pf.report( "T15" );
        pf.report( "T16" );
        pf.report( "T17" );
        pf.report( "T18" );
        pf.report( "T19" );
        pf.report( "T20" );
        pf.report( "T21" );
        pf.report( "T22" );
        pf.report( "T23" );
        pf.report( "C1" );
        pf.report( "C2" );
        pf.report( "C3" );
        pf.report( "C4" );
        pf.report( "C5" );
        pf.report( "C6" );
        pf.report( "C7" );
        pf.report( "C8" );
        pf.report( "C9" );
        pf.report( "C10" );
        pf.report( "C11" );
        pf.report( "C12" );
        pf.report( "C13" );
        pf.report( "C14" );
        pf.report( "C15" );
        pf.report( "C16" );
        pf.report( "C17" );
        pf.report( "C18" );
        pf.report( "C19" );
        pf.report( "C20" );
        pf.report( "C21" );
        pf.report( "Y1" );
        pf.report( "Y2" );
        pf.report( "Y3" );
        pf.report( "Y4" );
        pf.report( "Y5" );
        pf.report( "Y6" );
        pf.report( "Y7" );
        pf.report( "Y8" );
        pf.report( "Y9" );
        pf.report( "Y10" );
        pf.report( "Y11" );
        pf.report( "Y13" );
        pf.report( "Y14" );
        pf.report( "Y15" );
        pf.report( "Y16" );
        pf.report( "Y17" );
        pf.report( "Y18" );
        pf.report( "Y19" );
        pf.report( "Y20" );
        pf.report( "Y21" );
        pf.report( "Y22" );
        pf.report( "Y23" );
        pf.report( "Z1" );
        pf.report( "Z2" );
        pf.report( "Z3" );
        pf.report( "Z4" );
        pf.report( "Z5" );
        pf.report( "Z6" );
        pf.report( "Z7" );
        pf.report( "Z8" );
        pf.report( "Z9" );
        pf.report( "Z10" );
        pf.report( "Z11" );
        pf.report( "Z13" );
        pf.report( "Z14" );
        pf.report( "N1" );
        pf.report( "N2" );
        pf.report( "N3" );
        pf.report( "N4" );
        pf.report( "N5" );
        pf.report( "N6" );
        pf.report( "N7" );
        pf.report( "N8" );
        pf.report( "N9" );
        pf.report( "N10" );
        pf.report( "N11" );
        pf.report( "N13" );
        pf.report( "N14" );
        pf.report( "N15" );
        pf.report( "N16" );
        pf.report( "N17" );
        pf.report( "N18" );
        pf.report( "N19" );
        pf.report( "F1" );
        pf.report( "F2" );
        pf.report( "F3" );
        pf.report( "F4" );
        pf.report( "F5" );
        pf.report( "F6" );
        pf.report( "F7" );
        pf.report( "F8" );
        pf.report( "F9" );
        pf.report( "F10" );
        pf.report( "F11" );
        pf.report( "F13" );
        pf.report( "F14" );
        pf.report( "F15" );
        pf.report( "F16" );
       
        
    } // main( String [] )


    private void report( String airport ) {
            if(this.distanceTo(airport)<=2 && this.distanceTo(airport)>0){
            for (String v : this.pathTo(airport)) {
                StdOut.println("   " + v);
            }
            
            StdOut.println("distance " + this.distanceTo(airport));
            }
    } // report( PathFinder, String )
    
} // PathFinder
