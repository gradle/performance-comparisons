package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_169 {
    private final Production40_169 production = new Production40_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}