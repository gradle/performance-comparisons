package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_349 {
    private final Production54_349 production = new Production54_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}