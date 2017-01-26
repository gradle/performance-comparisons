package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_163 {
    private final Production72_163 production = new Production72_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}