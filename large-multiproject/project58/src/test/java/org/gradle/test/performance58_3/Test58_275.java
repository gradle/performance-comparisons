package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_275 {
    private final Production58_275 production = new Production58_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}