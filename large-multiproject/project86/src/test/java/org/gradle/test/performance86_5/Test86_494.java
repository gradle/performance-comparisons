package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_494 {
    private final Production86_494 production = new Production86_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}