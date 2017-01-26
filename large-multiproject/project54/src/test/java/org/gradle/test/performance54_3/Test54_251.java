package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_251 {
    private final Production54_251 production = new Production54_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}