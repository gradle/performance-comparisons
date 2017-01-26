package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_153 {
    private final Production58_153 production = new Production58_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}