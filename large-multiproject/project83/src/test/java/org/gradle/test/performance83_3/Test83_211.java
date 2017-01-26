package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_211 {
    private final Production83_211 production = new Production83_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}