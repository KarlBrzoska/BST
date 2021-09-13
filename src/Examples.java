import static org.junit.Assert.*;
import org.junit.Test;

//Karl Brzoska and Elidja Diakite
public class Examples {



        //Examples(){}



        MtHeap mtheap= new MtHeap();
        HeapChecker ht = new HeapChecker();
        DataHeap fifty = new DataHeap(50);
        DataHeap thirtyseven = new DataHeap(37);
    DataHeap fourty1 = new DataHeap(41);
        DataHeap twentysix = new DataHeap(26);
        DataHeap thirty = new DataHeap(30);
        DataHeap seventeen = new DataHeap(17, thirty, fourty1);
        DataHeap fourty = new DataHeap(40, fifty, mtheap);
         DataHeap seventeen1 = new DataHeap(17, thirty, mtheap);



        DataHeap ten = new DataHeap(10, twentysix, seventeen);
        DataHeap fifteen = new DataHeap(15, twentysix, seventeen);
        DataHeap three = new DataHeap(3, ten, fifteen);
        DataHeap fifteen2 = new DataHeap(15, twentysix, seventeen1);
        DataHeap three1 = new DataHeap(3, ten, fifteen2);
        DataHeap three2 = new DataHeap(4, ten, fifteen2);



        //Not valid
        DataHeap nine = new DataHeap(9);
        DataHeap twelve = new DataHeap(12, nine, mtheap);
        DataHeap thirteen = new DataHeap(13);
        DataHeap nine1 = new DataHeap(9, thirteen, mtheap);
        DataHeap thirteen1 = new DataHeap(13, fifty, mtheap );
        DataHeap twelve1 = new DataHeap(12, nine, nine);

        @Test
        public void testTrees(){
            MtHeap mtheap= new MtHeap();
            HeapChecker ht = new HeapChecker();
            DataHeap fifty = new DataHeap(50);
            DataHeap thirtyseven = new DataHeap(37);
            DataHeap fourty1 = new DataHeap(41);
            DataHeap twentysix = new DataHeap(26);
            DataHeap thirty = new DataHeap(30);
            DataHeap seventeen = new DataHeap(17, thirty, fourty1);
            DataHeap fourty = new DataHeap(40, fifty, mtheap);
            DataHeap seventeen1 = new DataHeap(17, thirty, mtheap);



            DataHeap ten = new DataHeap(10, twentysix, seventeen);
            DataHeap fifteen = new DataHeap(15, twentysix, seventeen);
            DataHeap three = new DataHeap(3, ten, fifteen);
            DataHeap fifteen2 = new DataHeap(15, twentysix, seventeen1);
            DataHeap three1 = new DataHeap(3, ten, fifteen2);
            DataHeap three2 = new DataHeap(4, ten, fifteen2);



            //Not valid
            DataHeap nine = new DataHeap(9);
            DataHeap twelve = new DataHeap(12, nine, mtheap);
            DataHeap thirteen = new DataHeap(13);
            DataHeap nine1 = new DataHeap(9, thirteen, mtheap);
            DataHeap thirteen1 = new DataHeap(13, fifty, mtheap );
            DataHeap twelve1 = new DataHeap(12, nine, nine);
        }





        @Test
        public void testIfTreeIsAHeap(){
            assertTrue(ht.addEltTester(three, 100, three.addElt(100)));
        }

        @Test
        public void invalidHeap(){
        assertFalse(ht.addEltTester(twelve, 9, twelve));
     }

        @Test
        public void invalidHeapAppearsOtherWrongNumberOfTimes(){
        assertFalse(ht.addEltTester(twelve, 9, twelve1));
        }

        @Test
        public void validHeap(){
        assertFalse(ht.addEltTester(twelve, 13, twelve1));
        }

        @Test
        public void validHeapAddedEltAppearsWrongNumberOfTimes(){
        assertFalse(ht.addEltTester(nine, 9, nine1));
        }

        @Test
        public void AValid(){
        assertTrue(ht.addEltTester(three1, 41, three));
         }

            @Test
         public void appearWrongNumberOfTimesNonadded(){
            assertFalse(ht.addEltTester(three2, 41, three));
            }

        @Test
        public void AppearsWrongNumberOfTimesExtraCount(){
        assertFalse(ht.addEltTester(seventeen, 40, seventeen1));
        }

        @Test
        public void AppearsWrongNumberTotalNumberOfElementsIncorrect(){
        assertFalse(ht.addEltTester(thirty, 40 , three));
        }












        @Test
        public void isValidHeapRemoveElement(){
        assertTrue(ht.remMinEltTester(three, three.remMinElt()));
        }

    @Test
    public void isNotValidHeapRemoveElement(){
        assertFalse(ht.remMinEltTester(twelve1, three.remMinElt()));
    }

    @Test
    public void RemoveElementOccursrightNumberOftimes(){
        assertTrue(ht.remMinEltTester(nine1, nine1.remMinElt()));
    }

    @Test
    public void RemoveElementOccurswrongNumberOftimesValidHeap(){
        assertFalse(ht.remMinEltTester(nine1, nine1));
    }


    @Test
    public void RemoveElementOccurswrongnumberofTimesInvalidHeap(){
        assertFalse(ht.remMinEltTester(twelve1, twelve1));
    }

    @Test
    public void OtherElementOccurswrongNumberOftimesp(){
        assertFalse(ht.remMinEltTester(nine1, thirteen1));
    }

    @Test
    public void OtherElementOccurswrongNumberOftimesp1(){
        assertFalse(ht.remMinEltTester(nine1, thirteen1));
    }

    @Test
    public void totalNumberofElementsIncorrect(){
        assertFalse(ht.remMinEltTester(nine1, mtheap));
    }

    @Test
    public void totalNumberofElementsIncorrect2(){
        assertFalse(ht.remMinEltTester(nine1, three));
    }



}






