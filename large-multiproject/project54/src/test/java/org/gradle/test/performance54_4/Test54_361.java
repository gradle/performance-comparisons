package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_361 {
    private final Production54_361 production = new Production54_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}