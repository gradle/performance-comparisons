package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_441 {
    private final Production54_441 production = new Production54_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}