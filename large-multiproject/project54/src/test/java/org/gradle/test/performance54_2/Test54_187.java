package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_187 {
    private final Production54_187 production = new Production54_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}