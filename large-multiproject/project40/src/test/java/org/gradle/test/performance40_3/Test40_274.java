package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_274 {
    private final Production40_274 production = new Production40_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}