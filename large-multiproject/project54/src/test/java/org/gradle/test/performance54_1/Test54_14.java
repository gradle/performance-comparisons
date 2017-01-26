package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_14 {
    private final Production54_14 production = new Production54_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}