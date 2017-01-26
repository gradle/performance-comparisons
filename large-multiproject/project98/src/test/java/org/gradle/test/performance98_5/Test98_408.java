package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_408 {
    private final Production98_408 production = new Production98_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}