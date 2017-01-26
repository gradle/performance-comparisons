package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_440 {
    private final Production54_440 production = new Production54_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}