package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_494 {
    private final Production27_494 production = new Production27_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}