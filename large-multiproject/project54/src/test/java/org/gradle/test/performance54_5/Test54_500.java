package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_500 {
    private final Production54_500 production = new Production54_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}