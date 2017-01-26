package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_413 {
    private final Production54_413 production = new Production54_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}