package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_11 {
    private final Production98_11 production = new Production98_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}