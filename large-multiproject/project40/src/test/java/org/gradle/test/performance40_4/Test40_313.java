package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_313 {
    private final Production40_313 production = new Production40_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}