package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_377 {
    private final Production54_377 production = new Production54_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}