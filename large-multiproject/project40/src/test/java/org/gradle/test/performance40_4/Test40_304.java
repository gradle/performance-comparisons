package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_304 {
    private final Production40_304 production = new Production40_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}