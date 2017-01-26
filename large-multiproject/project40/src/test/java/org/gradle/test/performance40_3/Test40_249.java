package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_249 {
    private final Production40_249 production = new Production40_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}