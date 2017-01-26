package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_489 {
    private final Production80_489 production = new Production80_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}