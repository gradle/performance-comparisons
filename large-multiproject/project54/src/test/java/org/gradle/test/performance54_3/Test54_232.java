package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_232 {
    private final Production54_232 production = new Production54_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}