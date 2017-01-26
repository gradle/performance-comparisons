package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_370 {
    private final Production54_370 production = new Production54_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}