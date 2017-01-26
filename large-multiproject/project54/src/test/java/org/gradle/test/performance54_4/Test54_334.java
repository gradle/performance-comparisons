package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_334 {
    private final Production54_334 production = new Production54_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}