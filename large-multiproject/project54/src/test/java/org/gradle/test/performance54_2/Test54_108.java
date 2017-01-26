package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_108 {
    private final Production54_108 production = new Production54_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}