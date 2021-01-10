package com.Amazon.Coding;

import java.util.*;



public class LRUCacheMisses {
    static class  Node {
        int value;
        public Node( int value ) {
            this.value = value;
        }
    }

    public static int lruCacheMisses(int num, List<Integer> pages, int maxCacheSize) {
        //num is the size of pages
        int counter = 0;
        LinkedList<Node> list = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();

        for ( Integer page : pages ) {
            if ( map.containsKey ( page ) ) {
                Node node = map.get ( page );
                list.removeFirstOccurrence( node );
                list.addLast( node );
            } else {
                counter++;
                if ( list.size() == maxCacheSize ) {
                    Node node = list.removeFirst();
                    map.remove(node.value);
                }
                Node node = new Node(page);
                list.addLast( node );
                map.put ( page, node );
            }
        }

        return counter;
    }

    public static void main ( String[] args ) {
        System.out.println (lruCacheMisses(6, Arrays.asList(new Integer[] { 1,2,1,3,1,2 }), 2 ) );
    }
}
