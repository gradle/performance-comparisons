package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_492 {
    private final Production54_492 production = new Production54_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}