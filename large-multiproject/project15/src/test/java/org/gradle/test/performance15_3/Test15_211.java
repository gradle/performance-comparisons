package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_211 {
    private final Production15_211 production = new Production15_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}