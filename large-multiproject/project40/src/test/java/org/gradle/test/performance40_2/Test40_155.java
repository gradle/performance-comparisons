package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_155 {
    private final Production40_155 production = new Production40_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}