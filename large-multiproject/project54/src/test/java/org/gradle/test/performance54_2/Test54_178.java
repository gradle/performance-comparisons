package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_178 {
    private final Production54_178 production = new Production54_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}