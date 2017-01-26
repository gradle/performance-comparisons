package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_190 {
    private final Production54_190 production = new Production54_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}