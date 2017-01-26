package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_242 {
    private final Production54_242 production = new Production54_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}