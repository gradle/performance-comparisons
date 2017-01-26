package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_237 {
    private final Production54_237 production = new Production54_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}