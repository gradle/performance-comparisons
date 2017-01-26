package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_327 {
    private final Production98_327 production = new Production98_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}