package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_365 {
    private final Production54_365 production = new Production54_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}