package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_11 {
    private final Production58_11 production = new Production58_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}