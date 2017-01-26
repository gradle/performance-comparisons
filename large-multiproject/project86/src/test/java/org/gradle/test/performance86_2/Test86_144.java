package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_144 {
    private final Production86_144 production = new Production86_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}