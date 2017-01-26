package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_480 {
    private final Production98_480 production = new Production98_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}