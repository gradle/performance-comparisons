package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_144 {
    private final Production1_144 production = new Production1_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}