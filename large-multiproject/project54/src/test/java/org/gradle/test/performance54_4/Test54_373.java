package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_373 {
    private final Production54_373 production = new Production54_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}