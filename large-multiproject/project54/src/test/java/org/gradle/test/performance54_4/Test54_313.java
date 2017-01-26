package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_313 {
    private final Production54_313 production = new Production54_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}