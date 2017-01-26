package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_213 {
    private final Production40_213 production = new Production40_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}