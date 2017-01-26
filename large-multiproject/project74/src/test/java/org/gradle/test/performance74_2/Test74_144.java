package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_144 {
    private final Production74_144 production = new Production74_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}