package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_494 {
    private final Production58_494 production = new Production58_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}