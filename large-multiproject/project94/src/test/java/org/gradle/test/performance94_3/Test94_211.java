package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_211 {
    private final Production94_211 production = new Production94_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}