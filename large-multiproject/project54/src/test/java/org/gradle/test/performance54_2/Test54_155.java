package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_155 {
    private final Production54_155 production = new Production54_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}