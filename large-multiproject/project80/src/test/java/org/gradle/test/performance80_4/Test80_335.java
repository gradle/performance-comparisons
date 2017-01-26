package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_335 {
    private final Production80_335 production = new Production80_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}