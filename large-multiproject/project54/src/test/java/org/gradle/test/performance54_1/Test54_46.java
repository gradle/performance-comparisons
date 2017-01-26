package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_46 {
    private final Production54_46 production = new Production54_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}