package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_174 {
    private final Production54_174 production = new Production54_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}