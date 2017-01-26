package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_211 {
    private final Production86_211 production = new Production86_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}