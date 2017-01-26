package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_463 {
    private final Production13_463 production = new Production13_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}