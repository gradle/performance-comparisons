package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_480 {
    private final Production40_480 production = new Production40_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}