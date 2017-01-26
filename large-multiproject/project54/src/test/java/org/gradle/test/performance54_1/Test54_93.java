package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_93 {
    private final Production54_93 production = new Production54_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}