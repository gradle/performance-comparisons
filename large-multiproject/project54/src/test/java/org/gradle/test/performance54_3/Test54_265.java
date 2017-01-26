package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_265 {
    private final Production54_265 production = new Production54_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}