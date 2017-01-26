package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_202 {
    private final Production54_202 production = new Production54_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}