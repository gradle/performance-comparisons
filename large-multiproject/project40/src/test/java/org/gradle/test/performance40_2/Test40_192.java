package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_192 {
    private final Production40_192 production = new Production40_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}