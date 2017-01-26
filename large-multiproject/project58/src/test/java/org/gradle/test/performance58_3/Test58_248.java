package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_248 {
    private final Production58_248 production = new Production58_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}