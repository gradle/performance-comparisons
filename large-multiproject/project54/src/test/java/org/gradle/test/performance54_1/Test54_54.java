package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_54 {
    private final Production54_54 production = new Production54_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}