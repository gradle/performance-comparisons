package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_381 {
    private final Production54_381 production = new Production54_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}