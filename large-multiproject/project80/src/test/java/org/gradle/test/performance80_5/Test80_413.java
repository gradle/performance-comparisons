package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_413 {
    private final Production80_413 production = new Production80_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}