package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_385 {
    private final Production98_385 production = new Production98_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}