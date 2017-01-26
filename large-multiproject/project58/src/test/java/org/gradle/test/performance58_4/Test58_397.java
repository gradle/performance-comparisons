package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_397 {
    private final Production58_397 production = new Production58_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}