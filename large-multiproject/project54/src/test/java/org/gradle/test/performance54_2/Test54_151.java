package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_151 {
    private final Production54_151 production = new Production54_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}