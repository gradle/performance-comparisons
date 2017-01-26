package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_144 {
    private final Production69_144 production = new Production69_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}