package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_144 {
    private final Production62_144 production = new Production62_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}