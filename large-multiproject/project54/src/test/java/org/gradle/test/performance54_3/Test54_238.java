package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_238 {
    private final Production54_238 production = new Production54_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}