package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_144 {
    private final Production99_144 production = new Production99_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}