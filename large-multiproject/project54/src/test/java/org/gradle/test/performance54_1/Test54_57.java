package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_57 {
    private final Production54_57 production = new Production54_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}