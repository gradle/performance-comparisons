package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_220 {
    private final Production54_220 production = new Production54_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}