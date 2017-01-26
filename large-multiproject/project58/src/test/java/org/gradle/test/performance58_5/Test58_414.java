package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_414 {
    private final Production58_414 production = new Production58_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}