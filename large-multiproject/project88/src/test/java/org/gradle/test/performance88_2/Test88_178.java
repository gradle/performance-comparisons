package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_178 {
    private final Production88_178 production = new Production88_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}