package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_373 {
    private final Production72_373 production = new Production72_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}