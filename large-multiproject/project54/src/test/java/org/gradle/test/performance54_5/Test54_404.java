package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_404 {
    private final Production54_404 production = new Production54_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}