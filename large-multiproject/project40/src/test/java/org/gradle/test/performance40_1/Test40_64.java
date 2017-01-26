package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_64 {
    private final Production40_64 production = new Production40_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}