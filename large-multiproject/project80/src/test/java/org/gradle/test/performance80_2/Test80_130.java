package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_130 {
    private final Production80_130 production = new Production80_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}