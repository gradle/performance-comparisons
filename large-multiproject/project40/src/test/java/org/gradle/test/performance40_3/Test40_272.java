package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_272 {
    private final Production40_272 production = new Production40_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}