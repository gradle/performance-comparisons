package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_89 {
    private final Production54_89 production = new Production54_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}