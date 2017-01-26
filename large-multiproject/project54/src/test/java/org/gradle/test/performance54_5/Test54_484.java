package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_484 {
    private final Production54_484 production = new Production54_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}