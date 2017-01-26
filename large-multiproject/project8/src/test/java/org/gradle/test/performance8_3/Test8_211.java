package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_211 {
    private final Production8_211 production = new Production8_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}