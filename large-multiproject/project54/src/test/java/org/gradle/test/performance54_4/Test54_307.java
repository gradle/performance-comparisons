package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_307 {
    private final Production54_307 production = new Production54_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}