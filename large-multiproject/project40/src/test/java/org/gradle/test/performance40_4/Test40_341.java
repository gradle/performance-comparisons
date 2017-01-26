package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_341 {
    private final Production40_341 production = new Production40_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}