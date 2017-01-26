package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_397 {
    private final Production47_397 production = new Production47_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}