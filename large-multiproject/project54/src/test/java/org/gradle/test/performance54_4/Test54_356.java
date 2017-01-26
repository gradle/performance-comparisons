package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_356 {
    private final Production54_356 production = new Production54_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}