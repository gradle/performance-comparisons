package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_426 {
    private final Production54_426 production = new Production54_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}