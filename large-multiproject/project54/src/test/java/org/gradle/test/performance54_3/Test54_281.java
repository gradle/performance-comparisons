package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_281 {
    private final Production54_281 production = new Production54_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}