package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_178 {
    private final Production58_178 production = new Production58_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}