package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_144 {
    private final Production29_144 production = new Production29_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}