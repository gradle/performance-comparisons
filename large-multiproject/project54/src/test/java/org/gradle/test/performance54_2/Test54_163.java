package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_163 {
    private final Production54_163 production = new Production54_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}