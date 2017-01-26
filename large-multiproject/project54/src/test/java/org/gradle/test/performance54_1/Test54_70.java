package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_70 {
    private final Production54_70 production = new Production54_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}