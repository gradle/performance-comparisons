package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_275 {
    private final Production98_275 production = new Production98_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}