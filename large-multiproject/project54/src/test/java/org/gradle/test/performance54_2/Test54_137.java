package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_137 {
    private final Production54_137 production = new Production54_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}