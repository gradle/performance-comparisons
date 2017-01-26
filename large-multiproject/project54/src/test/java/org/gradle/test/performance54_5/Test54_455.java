package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_455 {
    private final Production54_455 production = new Production54_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}