package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_375 {
    private final Production98_375 production = new Production98_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}