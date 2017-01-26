package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_144 {
    private final Production9_144 production = new Production9_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}