package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_419 {
    private final Production54_419 production = new Production54_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}