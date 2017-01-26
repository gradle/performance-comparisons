package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_364 {
    private final Production54_364 production = new Production54_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}