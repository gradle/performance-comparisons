package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_157 {
    private final Production54_157 production = new Production54_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}