package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_211 {
    private final Production47_211 production = new Production47_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}