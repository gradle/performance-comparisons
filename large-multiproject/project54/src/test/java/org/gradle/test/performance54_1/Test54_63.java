package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_63 {
    private final Production54_63 production = new Production54_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}