package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_100 {
    private final Production54_100 production = new Production54_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}