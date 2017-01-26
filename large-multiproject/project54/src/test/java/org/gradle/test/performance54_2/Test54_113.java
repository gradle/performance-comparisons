package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_113 {
    private final Production54_113 production = new Production54_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}