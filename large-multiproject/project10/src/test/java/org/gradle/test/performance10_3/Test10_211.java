package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_211 {
    private final Production10_211 production = new Production10_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}