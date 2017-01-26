package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_448 {
    private final Production98_448 production = new Production98_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}