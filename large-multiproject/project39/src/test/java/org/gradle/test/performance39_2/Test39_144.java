package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_144 {
    private final Production39_144 production = new Production39_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}