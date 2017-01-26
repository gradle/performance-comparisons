package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_428 {
    private final Production98_428 production = new Production98_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}