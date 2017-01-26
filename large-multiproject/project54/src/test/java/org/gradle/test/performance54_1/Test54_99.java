package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_99 {
    private final Production54_99 production = new Production54_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}