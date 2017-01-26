package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_179 {
    private final Production80_179 production = new Production80_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}