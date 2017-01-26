package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_144 {
    private final Production36_144 production = new Production36_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}