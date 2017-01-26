package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_29 {
    private final Production54_29 production = new Production54_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}