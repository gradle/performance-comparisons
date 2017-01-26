package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_494 {
    private final Production24_494 production = new Production24_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}