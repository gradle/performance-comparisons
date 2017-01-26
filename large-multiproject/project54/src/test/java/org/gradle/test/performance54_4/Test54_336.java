package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_336 {
    private final Production54_336 production = new Production54_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}