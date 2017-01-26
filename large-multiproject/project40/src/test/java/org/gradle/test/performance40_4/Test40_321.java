package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_321 {
    private final Production40_321 production = new Production40_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}