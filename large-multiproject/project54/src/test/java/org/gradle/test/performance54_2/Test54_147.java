package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_147 {
    private final Production54_147 production = new Production54_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}