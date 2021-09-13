class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since enpty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }




    @Override
    public boolean isGreater(int rootnode) {
        return true;
    }

    @Override
    public boolean isHeap() {
        return true;
    }


    /**
     * helper that checks count
     * @param node
     * @return count of element
     */
    @Override
    public int count(int node) {
return 0;
    }


    /**
     * checks size of  mtbt
     * @param orig
     * @param new1
     * @return false if length of new does not follow rule
     */
    @Override
    public boolean correctSize(IHeap orig, IBinTree new1) {
        return false;
    }


    /**
     * checks size of  mtbt
     * @param i
     * @param new1
     * @return false if length of new does not follow rule
     */
    @Override
    public boolean correctSizeRemove(IHeap i, IBinTree new1) {
        return false;
    }

    /**
     * checks if all elements are present
     * @param orig
     * @param e
     * @param new1
     * @return true if mtbt
     */
    @Override
    public boolean containsAllElements(IHeap orig, int e, IBinTree new1) {
        return true;
    }

    /**
     * checks if all elements are present
     * @param orig
     * @param new1
     * @return true if mtbt
     */
    @Override
    public boolean containsAllElementsRemoved(IHeap orig, IBinTree new1) {
        return true;
    }
}