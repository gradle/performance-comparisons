package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_134 {
    private final Production54_134 production = new Production54_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}