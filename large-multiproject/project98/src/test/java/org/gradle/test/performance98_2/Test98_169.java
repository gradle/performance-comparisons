package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_169 {
    private final Production98_169 production = new Production98_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}