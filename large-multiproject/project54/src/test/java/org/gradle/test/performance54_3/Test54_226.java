package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_226 {
    private final Production54_226 production = new Production54_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}