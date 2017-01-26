package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_459 {
    private final Production40_459 production = new Production40_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}