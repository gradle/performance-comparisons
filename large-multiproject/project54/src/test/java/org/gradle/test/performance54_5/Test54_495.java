package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_495 {
    private final Production54_495 production = new Production54_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}