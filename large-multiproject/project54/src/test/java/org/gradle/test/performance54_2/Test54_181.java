package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_181 {
    private final Production54_181 production = new Production54_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}