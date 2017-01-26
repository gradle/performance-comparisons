package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_211 {
    private final Production80_211 production = new Production80_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}