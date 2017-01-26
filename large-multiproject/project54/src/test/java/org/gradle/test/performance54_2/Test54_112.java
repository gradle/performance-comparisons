package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_112 {
    private final Production54_112 production = new Production54_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}