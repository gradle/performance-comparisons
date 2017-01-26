package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_461 {
    private final Production54_461 production = new Production54_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}