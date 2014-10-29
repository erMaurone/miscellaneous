package com.mauro;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 30/07/2014
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 */
public class ValueVsRefTest {

    private Dog testDog;
    private ValueVsRef vvr;

    @Before
    public void SetUp(){
        testDog = new Dog("testDog");
        vvr = new ValueVsRef();
        vvr.setMyDog(testDog);
        vvr.publishMyDog();

    }

    @Test
    public void testMisplaceDog() throws Exception {

        System.out.println("testMisplacedDog");

        assertEquals(testDog.getName(), vvr.getMyDogName());
        vvr.misplaceDog(testDog);

        // misplaced dog is not visible outside the scope of the method
        assertEquals(testDog.getName(), vvr.getMyDogName());
        assertEquals(testDog.getName(), "testDog");

    }

    @Test
    public void testRenameDog() throws Exception {
        System.out.println("testRenameDog");
        vvr.renameDog("Ushuia");
        assertNotSame("testDog", vvr.getMyDogName());

        assertEquals(testDog.getName(), vvr.getMyDogName());

    }

}
