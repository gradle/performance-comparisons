package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_37 {
    private final Production54_37 production = new Production54_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}