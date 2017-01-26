package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_51 {
    private final Production54_51 production = new Production54_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}