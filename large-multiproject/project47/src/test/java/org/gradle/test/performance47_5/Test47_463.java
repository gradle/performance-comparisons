package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_463 {
    private final Production47_463 production = new Production47_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}