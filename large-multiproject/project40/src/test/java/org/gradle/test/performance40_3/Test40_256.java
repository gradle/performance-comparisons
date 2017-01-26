package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_256 {
    private final Production40_256 production = new Production40_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}