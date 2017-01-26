package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_486 {
    private final Production54_486 production = new Production54_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}