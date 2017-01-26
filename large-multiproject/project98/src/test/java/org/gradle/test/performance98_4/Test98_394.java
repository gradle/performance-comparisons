package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_394 {
    private final Production98_394 production = new Production98_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}