package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_368 {
    private final Production80_368 production = new Production80_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}