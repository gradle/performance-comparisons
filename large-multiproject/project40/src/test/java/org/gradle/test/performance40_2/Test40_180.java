package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_180 {
    private final Production40_180 production = new Production40_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}