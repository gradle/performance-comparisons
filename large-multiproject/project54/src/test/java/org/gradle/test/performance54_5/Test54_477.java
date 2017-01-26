package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_477 {
    private final Production54_477 production = new Production54_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}