package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_221 {
    private final Production40_221 production = new Production40_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}