package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_221 {
    private final Production54_221 production = new Production54_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}