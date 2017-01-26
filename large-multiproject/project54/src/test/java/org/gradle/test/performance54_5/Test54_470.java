package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_470 {
    private final Production54_470 production = new Production54_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}