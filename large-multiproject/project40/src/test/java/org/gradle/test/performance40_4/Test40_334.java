package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_334 {
    private final Production40_334 production = new Production40_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}