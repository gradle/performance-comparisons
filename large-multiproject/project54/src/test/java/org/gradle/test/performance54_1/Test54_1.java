package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_1 {
    private final Production54_1 production = new Production54_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}