package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_211 {
    private final Production97_211 production = new Production97_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}