package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_254 {
    private final Production40_254 production = new Production40_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}