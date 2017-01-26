package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_245 {
    private final Production80_245 production = new Production80_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}