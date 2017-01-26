package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_166 {
    private final Production54_166 production = new Production54_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}