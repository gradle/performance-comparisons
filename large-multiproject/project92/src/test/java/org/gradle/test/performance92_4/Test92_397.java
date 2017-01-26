package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_397 {
    private final Production92_397 production = new Production92_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}