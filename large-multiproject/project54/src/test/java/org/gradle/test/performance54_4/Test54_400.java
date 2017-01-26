package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_400 {
    private final Production54_400 production = new Production54_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}