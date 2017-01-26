package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_150 {
    private final Production54_150 production = new Production54_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}