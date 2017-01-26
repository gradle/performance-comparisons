package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_494 {
    private final Production14_494 production = new Production14_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}