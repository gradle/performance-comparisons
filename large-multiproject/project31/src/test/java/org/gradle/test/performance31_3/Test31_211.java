package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_211 {
    private final Production31_211 production = new Production31_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}