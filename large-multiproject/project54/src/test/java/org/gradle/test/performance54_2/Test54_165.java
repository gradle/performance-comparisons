package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_165 {
    private final Production54_165 production = new Production54_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}