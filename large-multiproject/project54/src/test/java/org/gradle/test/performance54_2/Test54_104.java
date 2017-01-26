package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_104 {
    private final Production54_104 production = new Production54_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}