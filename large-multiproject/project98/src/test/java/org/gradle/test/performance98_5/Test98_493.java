package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_493 {
    private final Production98_493 production = new Production98_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}