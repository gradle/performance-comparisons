package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_229 {
    private final Production54_229 production = new Production54_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}