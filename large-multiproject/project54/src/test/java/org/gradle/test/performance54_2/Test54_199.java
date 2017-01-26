package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_199 {
    private final Production54_199 production = new Production54_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}