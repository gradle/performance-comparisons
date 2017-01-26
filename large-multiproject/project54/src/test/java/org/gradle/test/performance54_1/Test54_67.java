package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_67 {
    private final Production54_67 production = new Production54_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}