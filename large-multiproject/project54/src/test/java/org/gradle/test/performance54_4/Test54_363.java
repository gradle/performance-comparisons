package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_363 {
    private final Production54_363 production = new Production54_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}