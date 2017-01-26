package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_175 {
    private final Production54_175 production = new Production54_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}