package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_172 {
    private final Production54_172 production = new Production54_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}