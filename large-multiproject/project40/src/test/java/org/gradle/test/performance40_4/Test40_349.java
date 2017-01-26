package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_349 {
    private final Production40_349 production = new Production40_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}