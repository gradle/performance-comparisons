package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_303 {
    private final Production54_303 production = new Production54_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}