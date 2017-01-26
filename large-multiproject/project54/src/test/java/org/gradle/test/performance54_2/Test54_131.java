package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_131 {
    private final Production54_131 production = new Production54_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}