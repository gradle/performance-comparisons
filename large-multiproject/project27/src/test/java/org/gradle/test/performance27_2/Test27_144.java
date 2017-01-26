package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_144 {
    private final Production27_144 production = new Production27_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}