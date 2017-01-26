package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_194 {
    private final Production98_194 production = new Production98_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}