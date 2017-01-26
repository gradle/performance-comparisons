package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_494 {
    private final Production3_494 production = new Production3_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}