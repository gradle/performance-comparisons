package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_463 {
    private final Production75_463 production = new Production75_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}