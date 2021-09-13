import java.util.ArrayList;

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }




    /**
     * checks whether a node is greater than the node it is checking
     * @param node
     * @return boolean whether node is greater than node it is checking
     */
    @Override
    public boolean isGreater(int node) {
        if (this.data >= node) {
            return this.left.isGreater(node) && this.right.isGreater(node);
        } else {

            return false;

        }
    }

    /**
     * checks whether each subheap is greater than it's parent heap
     * @return boolean indicating this
     */
    @Override
    public boolean isHeap() {
        return isGreater(this.data);
    }

    /**
     * counts the number of occurences of a single element in a binary tree
     * @param node
     * @return an int indicationg the number of occurences
     */
    @Override
    public int count(int node) {
        if (this.data == node) {
            return 1 + this.left.count(node) + this.right.count(node);

        } else {
            return this.left.count(node) + this.right.count(node);
        }
    }

    /**
     * checks whether the number of occurences in the original heap=number of occurences in new heap.
     * @param orig
     * @param e
     * @param newBt
     * @return Boolean whether occurences in previous old tree is same as new tree
     */
     @Override
     public boolean containsAllElements(IHeap orig, int e, IBinTree newBt) {
         if (this.data == e) {
             if ((orig.count(e) + 1 == newBt.count(e))) {
                 return this.left.containsAllElements(orig, e, newBt) &&
                         this.right.containsAllElements(orig, e, newBt);
             } else {
                 return false;


             }
         } else {
             if ((orig.count(this.data) == newBt.count(this.data))) {
                 return this.left.containsAllElements(orig, e, newBt) &&
                         this.right.containsAllElements(orig, e, newBt);
             } else {
                 return false;


             }
         }
     }

    /**
     * checks whether the number of occurences in the original heap=number of occcurences in new heap.
     * @param orig
     * @param newBt
     * @return Boolean indicating whether number of occurences of an element is the same
     */
    @Override
    public boolean containsAllElementsRemoved(IHeap orig, IBinTree newBt) {
        if (this.data != this.data && (orig.count(this.data) == newBt.count(this.data))) {
            if ((orig.count(this.data) == newBt.count(this.data) +1)) {
                return this.left.containsAllElementsRemoved(orig, newBt) &&
                        this.right.containsAllElementsRemoved(orig, newBt);
            } else {
                return false;


            }
        } else {
            if ((orig.count(this.data) == newBt.count(this.data))) {
                return this.left.containsAllElementsRemoved(orig, newBt) &&
                        this.right.containsAllElementsRemoved(orig, newBt);
            } else {
                return false;


            }
        }
    }


    /**
     * checks whether the size of the new tree is one greaer than the old heap
     * @param orig
     * @param new1
     * @return boolean indicating whether size of new tree is +1 old tree
     */
    @Override
    public boolean correctSize(IHeap orig, IBinTree new1){
        return (orig.size() +1  == new1.size());
    }

    /**
     * checks whether the size of the new tree is one less than the old heap
     * @param orig
     * @param new1
     * @return boolean indicating whether size of new tree is -1 old tree
     */
    @Override
    public boolean correctSizeRemove(IHeap orig, IBinTree new1) {
        return (orig.size()  == new1.size() +1);
    }
    //need same for removeelt except that size will be -1






















}
