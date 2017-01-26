package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_146 {
    private final Production54_146 production = new Production54_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}