package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_397 {
    private final Production61_397 production = new Production61_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}