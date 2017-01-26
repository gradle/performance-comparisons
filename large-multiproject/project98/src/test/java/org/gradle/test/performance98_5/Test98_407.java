package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_407 {
    private final Production98_407 production = new Production98_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}