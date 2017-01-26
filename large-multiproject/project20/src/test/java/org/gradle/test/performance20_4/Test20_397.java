package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_397 {
    private final Production20_397 production = new Production20_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}