package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_306 {
    private final Production54_306 production = new Production54_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}