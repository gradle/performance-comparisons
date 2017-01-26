package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_450 {
    private final Production54_450 production = new Production54_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}