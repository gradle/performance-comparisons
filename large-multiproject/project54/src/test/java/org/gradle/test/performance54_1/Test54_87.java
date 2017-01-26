package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_87 {
    private final Production54_87 production = new Production54_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}