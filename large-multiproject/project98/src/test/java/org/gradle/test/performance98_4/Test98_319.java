package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_319 {
    private final Production98_319 production = new Production98_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}