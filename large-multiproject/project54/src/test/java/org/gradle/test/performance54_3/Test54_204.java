package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_204 {
    private final Production54_204 production = new Production54_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}