package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_397 {
    private final Production16_397 production = new Production16_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}