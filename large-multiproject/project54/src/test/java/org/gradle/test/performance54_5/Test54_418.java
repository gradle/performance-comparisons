package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_418 {
    private final Production54_418 production = new Production54_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}