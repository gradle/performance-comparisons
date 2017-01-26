package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_239 {
    private final Production54_239 production = new Production54_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}