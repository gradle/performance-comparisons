package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_258 {
    private final Production40_258 production = new Production40_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}