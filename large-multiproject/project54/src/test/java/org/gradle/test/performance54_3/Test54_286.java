package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_286 {
    private final Production54_286 production = new Production54_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}