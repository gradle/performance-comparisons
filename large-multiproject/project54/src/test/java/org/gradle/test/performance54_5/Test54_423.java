package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_423 {
    private final Production54_423 production = new Production54_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}