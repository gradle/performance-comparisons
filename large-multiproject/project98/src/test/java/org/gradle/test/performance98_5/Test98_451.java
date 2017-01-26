package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_451 {
    private final Production98_451 production = new Production98_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}