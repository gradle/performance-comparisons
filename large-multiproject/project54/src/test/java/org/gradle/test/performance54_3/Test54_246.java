package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_246 {
    private final Production54_246 production = new Production54_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}