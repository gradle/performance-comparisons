package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_397 {
    private final Production25_397 production = new Production25_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}