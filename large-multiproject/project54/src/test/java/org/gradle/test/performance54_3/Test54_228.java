package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_228 {
    private final Production54_228 production = new Production54_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}