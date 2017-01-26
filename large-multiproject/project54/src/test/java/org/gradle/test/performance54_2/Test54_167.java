package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_167 {
    private final Production54_167 production = new Production54_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}