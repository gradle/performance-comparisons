package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_293 {
    private final Production54_293 production = new Production54_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}