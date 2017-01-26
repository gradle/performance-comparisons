package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_193 {
    private final Production54_193 production = new Production54_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}