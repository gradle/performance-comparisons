package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_75 {
    private final Production54_75 production = new Production54_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}