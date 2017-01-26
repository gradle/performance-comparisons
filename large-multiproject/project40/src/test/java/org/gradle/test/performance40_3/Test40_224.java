package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_224 {
    private final Production40_224 production = new Production40_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}