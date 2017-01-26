package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_144 {
    private final Production2_144 production = new Production2_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}