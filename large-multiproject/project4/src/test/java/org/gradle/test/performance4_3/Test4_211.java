package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_211 {
    private final Production4_211 production = new Production4_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}