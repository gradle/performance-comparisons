package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_480 {
    private final Production58_480 production = new Production58_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}