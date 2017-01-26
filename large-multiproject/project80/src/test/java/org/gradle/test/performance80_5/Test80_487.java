package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_487 {
    private final Production80_487 production = new Production80_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}