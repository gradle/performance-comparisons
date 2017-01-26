package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_144 {
    private final Production96_144 production = new Production96_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}