package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_98 {
    private final Production54_98 production = new Production54_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}