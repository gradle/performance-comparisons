package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_294 {
    private final Production54_294 production = new Production54_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}