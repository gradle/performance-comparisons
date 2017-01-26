package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_300 {
    private final Production54_300 production = new Production54_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}