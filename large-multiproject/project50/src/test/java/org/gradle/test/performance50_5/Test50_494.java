package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_494 {
    private final Production50_494 production = new Production50_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}