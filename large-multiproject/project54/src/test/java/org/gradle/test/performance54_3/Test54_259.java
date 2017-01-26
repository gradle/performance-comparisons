package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_259 {
    private final Production54_259 production = new Production54_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}