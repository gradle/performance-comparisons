package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_325 {
    private final Production54_325 production = new Production54_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}