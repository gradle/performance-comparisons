package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_182 {
    private final Production54_182 production = new Production54_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}