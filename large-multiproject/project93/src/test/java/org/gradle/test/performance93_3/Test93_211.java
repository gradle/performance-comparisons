package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_211 {
    private final Production93_211 production = new Production93_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}