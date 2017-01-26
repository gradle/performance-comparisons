package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_24 {
    private final Production40_24 production = new Production40_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}