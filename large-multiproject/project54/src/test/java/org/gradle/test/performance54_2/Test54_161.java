package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_161 {
    private final Production54_161 production = new Production54_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}