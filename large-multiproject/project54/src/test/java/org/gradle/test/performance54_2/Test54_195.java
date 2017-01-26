package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_195 {
    private final Production54_195 production = new Production54_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}