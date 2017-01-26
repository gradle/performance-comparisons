package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_494 {
    private final Production43_494 production = new Production43_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}