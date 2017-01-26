package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_465 {
    private final Production54_465 production = new Production54_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}