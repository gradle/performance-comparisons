package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_144 {
    private final Production49_144 production = new Production49_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}