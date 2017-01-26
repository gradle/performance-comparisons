package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_101 {
    private final Production80_101 production = new Production80_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}