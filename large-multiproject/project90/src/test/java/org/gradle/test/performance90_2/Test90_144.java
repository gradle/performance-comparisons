package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_144 {
    private final Production90_144 production = new Production90_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}