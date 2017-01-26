package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_106 {
    private final Production54_106 production = new Production54_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}