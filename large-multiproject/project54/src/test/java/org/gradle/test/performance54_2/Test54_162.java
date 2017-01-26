package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_162 {
    private final Production54_162 production = new Production54_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}