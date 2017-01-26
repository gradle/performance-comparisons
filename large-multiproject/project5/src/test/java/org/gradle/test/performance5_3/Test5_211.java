package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_211 {
    private final Production5_211 production = new Production5_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}