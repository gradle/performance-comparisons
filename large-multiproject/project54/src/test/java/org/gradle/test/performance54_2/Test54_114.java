package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_114 {
    private final Production54_114 production = new Production54_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}