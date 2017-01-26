package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_494 {
    private final Production5_494 production = new Production5_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}