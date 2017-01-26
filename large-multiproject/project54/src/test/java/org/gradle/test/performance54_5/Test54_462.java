package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_462 {
    private final Production54_462 production = new Production54_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}