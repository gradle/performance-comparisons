package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_243 {
    private final Production54_243 production = new Production54_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}