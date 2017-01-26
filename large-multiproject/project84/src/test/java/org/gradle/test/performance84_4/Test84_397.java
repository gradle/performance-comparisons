package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_397 {
    private final Production84_397 production = new Production84_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}