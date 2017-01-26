package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_205 {
    private final Production54_205 production = new Production54_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}