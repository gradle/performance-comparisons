package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_65 {
    private final Production54_65 production = new Production54_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}