package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_442 {
    private final Production54_442 production = new Production54_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}