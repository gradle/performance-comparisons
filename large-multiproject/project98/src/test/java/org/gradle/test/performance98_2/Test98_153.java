package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_153 {
    private final Production98_153 production = new Production98_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}