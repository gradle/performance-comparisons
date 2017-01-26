package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_335 {
    private final Production98_335 production = new Production98_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}