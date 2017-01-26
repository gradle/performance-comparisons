package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_494 {
    private final Production16_494 production = new Production16_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}