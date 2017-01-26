package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_395 {
    private final Production54_395 production = new Production54_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}