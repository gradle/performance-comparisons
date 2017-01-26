package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_483 {
    private final Production98_483 production = new Production98_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}