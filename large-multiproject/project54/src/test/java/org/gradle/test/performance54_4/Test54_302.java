package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_302 {
    private final Production54_302 production = new Production54_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}