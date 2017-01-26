package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_397 {
    private final Production37_397 production = new Production37_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}