package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_494 {
    private final Production61_494 production = new Production61_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}