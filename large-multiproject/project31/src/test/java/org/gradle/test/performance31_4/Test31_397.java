package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_397 {
    private final Production31_397 production = new Production31_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}