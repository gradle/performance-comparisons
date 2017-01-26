package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_494 {
    private final Production89_494 production = new Production89_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}