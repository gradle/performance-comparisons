package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_482 {
    private final Production54_482 production = new Production54_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}