package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_107 {
    private final Production54_107 production = new Production54_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}