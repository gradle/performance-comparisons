package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_223 {
    private final Production98_223 production = new Production98_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}