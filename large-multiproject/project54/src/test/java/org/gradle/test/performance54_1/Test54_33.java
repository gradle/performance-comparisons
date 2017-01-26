package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_33 {
    private final Production54_33 production = new Production54_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}