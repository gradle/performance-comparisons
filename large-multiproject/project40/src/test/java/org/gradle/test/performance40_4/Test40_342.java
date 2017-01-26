package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_342 {
    private final Production40_342 production = new Production40_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}