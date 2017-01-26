package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_211 {
    private final Production75_211 production = new Production75_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}