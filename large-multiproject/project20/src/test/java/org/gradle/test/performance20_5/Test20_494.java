package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_494 {
    private final Production20_494 production = new Production20_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}