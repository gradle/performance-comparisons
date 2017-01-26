package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_330 {
    private final Production54_330 production = new Production54_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}