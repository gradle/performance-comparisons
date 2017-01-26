package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_347 {
    private final Production54_347 production = new Production54_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}