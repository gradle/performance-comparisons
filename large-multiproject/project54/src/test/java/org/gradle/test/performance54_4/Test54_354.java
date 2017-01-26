package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_354 {
    private final Production54_354 production = new Production54_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}