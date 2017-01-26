package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_211 {
    private final Production84_211 production = new Production84_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}