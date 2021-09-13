public class HeapChecker  {


    HeapChecker(){};


    /**
     * checks whether a binary tree is a heap
     * @param hOrig
     * @param elt
     * @param hAdded
     * @return a boolean indicating whether a binary tree ia  heap
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        return hAdded.isHeap() &&  hAdded.containsAllElements(hOrig, elt, hAdded) && hAdded.correctSize(hOrig, hAdded);

    }

    /**
     * checks whether a binary tree is a heap
     * @param hOrig
     * @param hAdded
     * @return a boolean indicating whether a binary tree ia  heap
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hAdded) {//int elt?
        return hAdded.isHeap() &&  hAdded.containsAllElementsRemoved(hOrig, hAdded) && hAdded.correctSizeRemove(hOrig, hAdded);

    }




}
