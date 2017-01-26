package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_5 {
    private final Production54_5 production = new Production54_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}