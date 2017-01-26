package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_124 {
    private final Production72_124 production = new Production72_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}