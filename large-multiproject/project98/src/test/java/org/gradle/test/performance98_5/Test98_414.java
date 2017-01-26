package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_414 {
    private final Production98_414 production = new Production98_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}