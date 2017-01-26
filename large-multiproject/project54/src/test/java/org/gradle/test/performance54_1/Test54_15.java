package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_15 {
    private final Production54_15 production = new Production54_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}