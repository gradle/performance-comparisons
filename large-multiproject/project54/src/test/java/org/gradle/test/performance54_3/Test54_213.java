package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_213 {
    private final Production54_213 production = new Production54_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}