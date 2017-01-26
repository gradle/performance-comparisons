package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_144 {
    private final Production14_144 production = new Production14_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}