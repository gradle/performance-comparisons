package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_415 {
    private final Production54_415 production = new Production54_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}