package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_64 {
    private final Production54_64 production = new Production54_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}