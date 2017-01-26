package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_485 {
    private final Production40_485 production = new Production40_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}