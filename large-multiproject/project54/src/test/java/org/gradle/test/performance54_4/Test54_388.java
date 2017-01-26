package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_388 {
    private final Production54_388 production = new Production54_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}