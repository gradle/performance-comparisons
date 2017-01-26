package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_345 {
    private final Production40_345 production = new Production40_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}