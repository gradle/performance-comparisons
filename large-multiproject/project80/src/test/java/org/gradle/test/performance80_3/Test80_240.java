package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_240 {
    private final Production80_240 production = new Production80_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}