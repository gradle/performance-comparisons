package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_8 {
    private final Production54_8 production = new Production54_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}