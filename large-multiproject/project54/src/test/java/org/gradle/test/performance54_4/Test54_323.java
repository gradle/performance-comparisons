package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_323 {
    private final Production54_323 production = new Production54_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}