package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_53 {
    private final Production54_53 production = new Production54_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}