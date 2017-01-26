package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_84 {
    private final Production54_84 production = new Production54_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}