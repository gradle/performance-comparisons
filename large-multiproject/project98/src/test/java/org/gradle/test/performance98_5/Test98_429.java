package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_429 {
    private final Production98_429 production = new Production98_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}