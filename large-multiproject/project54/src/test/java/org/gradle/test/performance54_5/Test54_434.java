package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_434 {
    private final Production54_434 production = new Production54_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}