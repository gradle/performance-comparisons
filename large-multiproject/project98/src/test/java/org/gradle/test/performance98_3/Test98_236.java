package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_236 {
    private final Production98_236 production = new Production98_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}