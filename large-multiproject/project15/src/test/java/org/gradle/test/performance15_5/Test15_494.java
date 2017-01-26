package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_494 {
    private final Production15_494 production = new Production15_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}