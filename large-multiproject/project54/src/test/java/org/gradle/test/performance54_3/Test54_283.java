package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_283 {
    private final Production54_283 production = new Production54_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}