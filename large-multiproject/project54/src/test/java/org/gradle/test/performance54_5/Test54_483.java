package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_483 {
    private final Production54_483 production = new Production54_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}