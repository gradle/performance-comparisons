package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_178 {
    private final Production75_178 production = new Production75_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}