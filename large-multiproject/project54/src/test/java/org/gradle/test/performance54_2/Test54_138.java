package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_138 {
    private final Production54_138 production = new Production54_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}