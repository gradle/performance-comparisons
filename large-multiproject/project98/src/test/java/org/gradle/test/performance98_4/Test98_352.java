package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_352 {
    private final Production98_352 production = new Production98_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}