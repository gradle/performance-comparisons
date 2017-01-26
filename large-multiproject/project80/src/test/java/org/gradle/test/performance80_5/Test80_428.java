package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_428 {
    private final Production80_428 production = new Production80_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}