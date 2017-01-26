package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_9 {
    private final Production54_9 production = new Production54_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}