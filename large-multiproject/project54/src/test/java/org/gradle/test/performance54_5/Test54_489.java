package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_489 {
    private final Production54_489 production = new Production54_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}