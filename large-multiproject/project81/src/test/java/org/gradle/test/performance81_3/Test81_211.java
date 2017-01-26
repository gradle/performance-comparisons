package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_211 {
    private final Production81_211 production = new Production81_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}