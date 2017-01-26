package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_399 {
    private final Production80_399 production = new Production80_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}