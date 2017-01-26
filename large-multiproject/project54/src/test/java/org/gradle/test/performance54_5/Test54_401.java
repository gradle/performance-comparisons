package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_401 {
    private final Production54_401 production = new Production54_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}