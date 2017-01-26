package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_21 {
    private final Production80_21 production = new Production80_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}