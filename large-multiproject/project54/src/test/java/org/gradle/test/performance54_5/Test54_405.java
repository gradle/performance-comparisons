package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_405 {
    private final Production54_405 production = new Production54_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}