package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_494 {
    private final Production10_494 production = new Production10_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}