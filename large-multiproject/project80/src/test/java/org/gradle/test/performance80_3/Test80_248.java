package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_248 {
    private final Production80_248 production = new Production80_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}