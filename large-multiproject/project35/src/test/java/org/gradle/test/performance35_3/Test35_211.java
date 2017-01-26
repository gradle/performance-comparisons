package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_211 {
    private final Production35_211 production = new Production35_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}