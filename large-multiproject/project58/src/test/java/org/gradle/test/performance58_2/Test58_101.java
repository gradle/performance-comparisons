package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_101 {
    private final Production58_101 production = new Production58_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}