package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_384 {
    private final Production40_384 production = new Production40_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}