package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_397 {
    private final Production63_397 production = new Production63_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}