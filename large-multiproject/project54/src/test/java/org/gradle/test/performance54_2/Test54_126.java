package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_126 {
    private final Production54_126 production = new Production54_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}