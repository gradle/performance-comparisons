package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_383 {
    private final Production72_383 production = new Production72_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}