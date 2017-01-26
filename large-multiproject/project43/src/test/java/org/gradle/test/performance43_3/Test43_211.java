package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_211 {
    private final Production43_211 production = new Production43_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}