package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_458 {
    private final Production54_458 production = new Production54_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}