package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_490 {
    private final Production80_490 production = new Production80_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}