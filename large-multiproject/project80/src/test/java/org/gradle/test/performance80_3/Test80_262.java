package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_262 {
    private final Production80_262 production = new Production80_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}