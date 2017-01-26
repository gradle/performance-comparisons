package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_200 {
    private final Production54_200 production = new Production54_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}