package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_168 {
    private final Production54_168 production = new Production54_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}