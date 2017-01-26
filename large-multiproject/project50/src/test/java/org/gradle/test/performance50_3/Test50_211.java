package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_211 {
    private final Production50_211 production = new Production50_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}