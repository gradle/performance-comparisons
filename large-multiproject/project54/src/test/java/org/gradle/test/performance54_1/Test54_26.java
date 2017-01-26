package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_26 {
    private final Production54_26 production = new Production54_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}