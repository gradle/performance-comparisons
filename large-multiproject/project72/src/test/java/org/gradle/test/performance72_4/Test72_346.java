package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_346 {
    private final Production72_346 production = new Production72_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}