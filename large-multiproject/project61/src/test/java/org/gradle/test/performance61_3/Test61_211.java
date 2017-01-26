package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_211 {
    private final Production61_211 production = new Production61_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}