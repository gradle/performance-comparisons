package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_397 {
    private final Production5_397 production = new Production5_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}