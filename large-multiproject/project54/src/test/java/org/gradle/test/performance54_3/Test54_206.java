package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_206 {
    private final Production54_206 production = new Production54_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}