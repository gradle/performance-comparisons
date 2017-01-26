package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_429 {
    private final Production80_429 production = new Production80_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}