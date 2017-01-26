package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_109 {
    private final Production54_109 production = new Production54_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}