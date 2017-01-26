package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_144 {
    private final Production26_144 production = new Production26_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}