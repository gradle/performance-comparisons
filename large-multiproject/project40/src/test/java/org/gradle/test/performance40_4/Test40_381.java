package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_381 {
    private final Production40_381 production = new Production40_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}