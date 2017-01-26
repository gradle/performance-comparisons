package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_268 {
    private final Production54_268 production = new Production54_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}