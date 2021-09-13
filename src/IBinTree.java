interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();



    boolean isGreater(int rootnode);

    boolean isHeap();


    int count(int node);

    boolean correctSize(IHeap orig, IBinTree new1);

    boolean correctSizeRemove(IHeap i, IBinTree new1);

    boolean containsAllElements(IHeap orig, int e, IBinTree new1);
    boolean containsAllElementsRemoved(IHeap orig, IBinTree new1);
}
