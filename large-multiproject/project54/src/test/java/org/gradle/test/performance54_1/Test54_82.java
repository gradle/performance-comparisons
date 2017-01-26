package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_82 {
    private final Production54_82 production = new Production54_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}