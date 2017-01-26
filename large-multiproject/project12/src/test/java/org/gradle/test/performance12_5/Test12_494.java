package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_494 {
    private final Production12_494 production = new Production12_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}