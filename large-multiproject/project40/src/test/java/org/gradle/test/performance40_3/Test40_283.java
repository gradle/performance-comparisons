package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_283 {
    private final Production40_283 production = new Production40_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}