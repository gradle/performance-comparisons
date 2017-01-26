package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_144 {
    private final Production61_144 production = new Production61_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}