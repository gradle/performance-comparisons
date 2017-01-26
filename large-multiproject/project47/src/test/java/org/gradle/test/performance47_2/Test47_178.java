package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_178 {
    private final Production47_178 production = new Production47_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}