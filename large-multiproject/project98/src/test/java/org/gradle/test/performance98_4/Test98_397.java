package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_397 {
    private final Production98_397 production = new Production98_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}