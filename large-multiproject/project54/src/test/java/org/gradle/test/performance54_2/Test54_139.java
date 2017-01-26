package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_139 {
    private final Production54_139 production = new Production54_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}