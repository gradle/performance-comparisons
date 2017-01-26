package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_254 {
    private final Production54_254 production = new Production54_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}