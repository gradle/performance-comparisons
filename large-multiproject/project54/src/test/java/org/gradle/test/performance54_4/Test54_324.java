package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_324 {
    private final Production54_324 production = new Production54_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}