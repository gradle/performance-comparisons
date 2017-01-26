package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_397 {
    private final Production89_397 production = new Production89_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}