package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_397 {
    private final Production72_397 production = new Production72_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}