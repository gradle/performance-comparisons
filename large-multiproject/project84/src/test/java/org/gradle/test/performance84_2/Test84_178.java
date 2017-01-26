package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_178 {
    private final Production84_178 production = new Production84_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}