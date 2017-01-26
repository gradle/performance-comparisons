package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_382 {
    private final Production54_382 production = new Production54_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}