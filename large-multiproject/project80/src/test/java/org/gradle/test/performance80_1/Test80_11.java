package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_11 {
    private final Production80_11 production = new Production80_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}