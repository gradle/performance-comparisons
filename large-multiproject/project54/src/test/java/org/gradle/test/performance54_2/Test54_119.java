package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_119 {
    private final Production54_119 production = new Production54_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}