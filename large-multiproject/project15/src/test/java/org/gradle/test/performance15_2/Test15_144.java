package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_144 {
    private final Production15_144 production = new Production15_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}