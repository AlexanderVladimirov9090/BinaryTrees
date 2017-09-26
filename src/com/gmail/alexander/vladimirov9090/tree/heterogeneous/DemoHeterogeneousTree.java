package com.gmail.alexander.vladimirov9090.tree.heterogeneous;

/**
 * Created on 25.04.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class DemoHeterogeneousTree {
    public static void main(String[] args) {
        Cat persian = new Cat();
        Dog bulldog  = new Dog();
        Developer javaDev = new Developer();




        HeterogeneousTree hTree = new HeterogeneousTree();


        hTree.add(99,persian);
        hTree.add(98,bulldog);
        hTree.add(97,javaDev);
        hTree.add(99,persian);
        System.out.println("Traverse com.gmail.alexander.vladimirov9090.tree by order");
        hTree.traverse();

        System.out.println("Find the dog");
        System.out.println(hTree.findNode(98));
    }
}
