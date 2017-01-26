package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_95 {
    private final Production54_95 production = new Production54_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}