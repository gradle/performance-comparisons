package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_117 {
    private final Production80_117 production = new Production80_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}