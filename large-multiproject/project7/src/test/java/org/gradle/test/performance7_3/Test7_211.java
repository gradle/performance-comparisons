package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_211 {
    private final Production7_211 production = new Production7_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}