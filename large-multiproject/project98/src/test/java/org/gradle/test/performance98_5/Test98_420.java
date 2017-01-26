package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_420 {
    private final Production98_420 production = new Production98_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}