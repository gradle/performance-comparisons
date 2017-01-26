package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_236 {
    private final Production40_236 production = new Production40_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}