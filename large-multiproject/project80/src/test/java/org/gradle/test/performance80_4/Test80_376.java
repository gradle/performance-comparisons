package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_376 {
    private final Production80_376 production = new Production80_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}