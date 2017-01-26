package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_403 {
    private final Production40_403 production = new Production40_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}