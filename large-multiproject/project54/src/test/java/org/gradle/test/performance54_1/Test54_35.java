package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_35 {
    private final Production54_35 production = new Production54_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}