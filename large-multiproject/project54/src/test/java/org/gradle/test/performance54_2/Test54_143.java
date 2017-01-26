package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_143 {
    private final Production54_143 production = new Production54_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}