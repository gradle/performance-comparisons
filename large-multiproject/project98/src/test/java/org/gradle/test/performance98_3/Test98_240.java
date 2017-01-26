package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_240 {
    private final Production98_240 production = new Production98_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}