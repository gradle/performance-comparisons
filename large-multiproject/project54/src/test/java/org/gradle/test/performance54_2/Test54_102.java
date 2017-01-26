package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_102 {
    private final Production54_102 production = new Production54_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}