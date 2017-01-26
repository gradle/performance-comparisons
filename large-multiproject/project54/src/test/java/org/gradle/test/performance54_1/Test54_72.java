package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_72 {
    private final Production54_72 production = new Production54_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}