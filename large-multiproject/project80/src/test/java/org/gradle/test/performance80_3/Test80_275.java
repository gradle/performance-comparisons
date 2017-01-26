package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_275 {
    private final Production80_275 production = new Production80_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}