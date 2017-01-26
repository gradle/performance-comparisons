package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_235 {
    private final Production54_235 production = new Production54_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}