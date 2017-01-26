package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_122 {
    private final Production54_122 production = new Production54_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}