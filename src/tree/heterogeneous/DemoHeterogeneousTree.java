package tree.heterogeneous;

/**
 * Created by clouway on 25.04.16.
 */
public class DemoHeterogeneousTree {
    public static void main(String[] args) {
        Cat persian = new Cat();
        Dog bulldog  = new Dog();
        Developer javaDev = new Developer();
        Developer phpDev = new Developer();



        HeterogeneousTree hTree = new HeterogeneousTree();


        hTree.add(99,persian);
        hTree.add(98,bulldog);
        hTree.add(97,javaDev);
        hTree.add(99,persian);
        hTree.add(100,phpDev);
        System.out.println("Traverse tree by order");
        hTree.traverse();

        System.out.println("Traverse tree by order");
        hTree.traverse();

        System.out.println("Find the dog");
        System.out.println(hTree.findNode(98));
        System.out.println("Find the dog");

        System.out.println(hTree.findNode(98));
        System.out.println("Find the dog");
        System.out.println(hTree.findNode(98));

        System.out.println(hTree.findNode(98));
        System.out.println("Find the dog");
        System.out.println(hTree.findNode(98));
    }
}
