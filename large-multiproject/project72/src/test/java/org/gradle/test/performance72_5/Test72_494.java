package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_494 {
    private final Production72_494 production = new Production72_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}