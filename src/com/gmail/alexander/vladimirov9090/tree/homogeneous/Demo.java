package com.gmail.alexander.vladimirov9090.tree.homogeneous;

/**
 * Created on 21.04.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {
    HomogeneousTree hTree = new HomogeneousTree();

        hTree.add(70 );
        hTree.add(30 );
        hTree.add(60 );
        hTree.add(25 );
        hTree.add(44 );
        hTree.add(6);
        hTree.add(999 );
        hTree.add(1000);
        hTree.add(1000);

        System.out.println("Ordered Traversing a com.gmail.alexander.vladimirov9090.tree");
        hTree.traverse();
        System.out.println("\nPre-Ordered Traversing a com.gmail.alexander.vladimirov9090.tree");

        System.out.println();
        System.out.println(hTree.findNode(60));
    }
}
