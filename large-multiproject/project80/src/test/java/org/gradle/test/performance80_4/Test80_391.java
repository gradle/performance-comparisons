package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_391 {
    private final Production80_391 production = new Production80_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}