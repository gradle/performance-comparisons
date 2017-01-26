package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_420 {
    private final Production40_420 production = new Production40_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}