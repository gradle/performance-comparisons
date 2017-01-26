package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_291 {
    private final Production40_291 production = new Production40_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}