package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_192 {
    private final Production54_192 production = new Production54_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}