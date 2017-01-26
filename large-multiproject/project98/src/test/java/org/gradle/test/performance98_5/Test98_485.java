package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_485 {
    private final Production98_485 production = new Production98_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}